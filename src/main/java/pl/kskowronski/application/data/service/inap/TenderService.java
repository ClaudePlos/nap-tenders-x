package pl.kskowronski.application.data.service.inap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kskowronski.application.data.entity.egeria.ckk.Address;
import pl.kskowronski.application.data.entity.egeria.ckk.Client;
import pl.kskowronski.application.data.entity.inap.Tender;
import pl.kskowronski.application.data.entity.inap.TenderDTO;
import pl.kskowronski.application.data.entity.inap.TenderDate;
import pl.kskowronski.application.data.service.MapperDate;
import pl.kskowronski.application.data.service.egeria.ckk.AddressRepo;
import pl.kskowronski.application.data.service.egeria.ckk.ClientRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TenderService {

    private TenderRepo repo;

    public TenderService(TenderRepo repo) {
        this.repo = repo;
    }

    @Autowired
    ClientRepo clientRepo;

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    TenderDateRepo tenderDateRepo;

    private MapperDate mapperDate = new MapperDate();

    public Optional<List<TenderDTO>> getAllTendersBeforePlacing(String numberOfDays){
        Optional<List<TenderDTO>> tendersDTO = Optional.of(new ArrayList<>());
        List<Tender> tenders = repo.getAllTendersBeforePlacing(numberOfDays);
            tenders.stream().forEach( item -> tendersDTO.get().add( mapperTender(item)));
        return tendersDTO;
    }


    private TenderDTO mapperTender( Tender t){
        TenderDTO tDTO = new TenderDTO();
        tDTO.setId(t.getId());
        tDTO.setAktywnosc(t.getAktywnosc());
        tDTO.setDataOgloszenia(t.getDataOgloszenia());
        tDTO.setDlugoscUmowy(t.getDlugoscUmowy());
        tDTO.setFormaPostepowania(t.getFormaPostepowania());
        tDTO.setResponsiblePersonFormal(t.getResponsiblePersonFormal());
        tDTO.setPackageNumber(t.getNumerPakietu());
        tDTO.setPriority(t.getPriorytet());
        tDTO.setParticipate(t.getParticipate());
        tDTO.setTenderType(t.getTypPrzetargu());

        Optional<Client> client = clientRepo.getClientByKlKod(t.getZamawiajacyId());
        Optional<Address> address = addressRepo.getMainAddressForClient(t.getZamawiajacyId());
        Optional<TenderDate> tenderDeadline = tenderDateRepo.getTenderDeadline(t.getId());

        if (client.isPresent()){
            tDTO.setPurchaser( client.get().getKldNazwa());
        }

        if (address.isPresent()){
            tDTO.setCity(address.get().getMiejscowosc());
        }

        if (tenderDeadline.isPresent()){
            tDTO.setDeadlineApplication(mapperDate.dtYYYYMMDDHHMM.format(tenderDeadline.get().getData()));
            tDTO.setDeadlineSort(tenderDeadline.get().getData());
        }

        return tDTO;
    }

}

