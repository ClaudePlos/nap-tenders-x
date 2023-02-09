package pl.kskowronski.application.endpoints.tenders;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;
import pl.kskowronski.application.data.entity.inap.TenderDTO;
import pl.kskowronski.application.data.service.inap.TenderService;

import java.util.List;
import java.util.Optional;

@Endpoint
@AnonymousAllowed
public class TendersEndpoint {

    private TenderService tenderService;

    public TendersEndpoint(TenderService tenderService) {
        this.tenderService = tenderService;
    }

    @Nonnull
    public List<TenderDTO> getAllTendersBeforePlacing(@Nonnull String numberOfDays) {
        Optional<List<TenderDTO>> tendersDTO = tenderService.getAllTendersBeforePlacing(numberOfDays);
        return tendersDTO.get();
    }

}
