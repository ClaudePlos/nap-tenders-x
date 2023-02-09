package pl.kskowronski.application.data.entity.inap;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "napwf_przetarg")
public class Tender {

    public static String STATUS_OGLOSZONY = "OGLOSZONY";
    public static String STATUS_ROZPATRYWANY = "ROZPATRYWANY";
    public static String STATUS_ROZSTRZYGNIETY = "ROZSTRZYGNIETY";
    public static String STATUS_ZAKONCZONY = "ZAKONCZONY";
    public static String AKTYWNOSC_UDZIAL = "UDZIAL";
    public static String AKTYWNOSC_BRAK_UDZIALU = "BRAK_UDZIALU";
    public static String AKTYWNOSC_W_DECYZJI = "W_DECYZJI";

    public static String TERMIN_ZLOZENIE_OFERT = "ZLOZENIE_OFERT";


    @Id
    @Column(name = "id", nullable = false)
    private BigDecimal id;

    @Column(name = "zamawiajacy_id", nullable = false)
    private BigDecimal zamawiajacyId;

    @Column(name = "data_ogloszenia",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataOgloszenia;

    @Column(name = "data_zlozenia")
    @Temporal(TemporalType.DATE)
    private Date dataZlozenia;

    @Column
    private String status;

    @Column
    private String aktywnosc;

    @Column(name = "przedmiot_zamowienia")
    private String przedmiotZamowienia;

    @Column(name = "typ_przetargu",nullable = false)
    private String typPrzetargu;

    @Column(name = "forma_postepowania",nullable = false)
    private String formaPostepowania;

    @Column(name = "okres_mc")
    private Long okresMc;

    @Column(name = "dlugosc_umowy")
    private Long dlugoscUmowy;

    @Column(name = "TERMINPLATNOSCIDNI")
    private Long terminPlatnosciDni;

    @Column(name="wynik_oceny")
    private String wynikOceny;

    @Column(name="progowy", nullable = false)
    private String progowy;

    @Column(name="responsible_person_formal")
    private String responsiblePersonFormal;

    @Column(name="FARCHIWALNY",nullable=false)
    private String fArchiwalny = "N";

    @Column(name="numer_pakietu")
    private String numerPakietu;

    @Column(name="priorytet")
    private BigDecimal priorytet;

    @Column(name="participate")
    private String participate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getZamawiajacyId() {
        return zamawiajacyId;
    }

    public void setZamawiajacyId(BigDecimal zamawiajacyId) {
        this.zamawiajacyId = zamawiajacyId;
    }

    public Date getDataOgloszenia() {
        return dataOgloszenia;
    }

    public void setDataOgloszenia(Date dataOgloszenia) {
        this.dataOgloszenia = dataOgloszenia;
    }

    public Date getDataZlozenia() {
        return dataZlozenia;
    }

    public void setDataZlozenia(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAktywnosc() {
        return aktywnosc;
    }

    public void setAktywnosc(String aktywnosc) {
        this.aktywnosc = aktywnosc;
    }

    public String getPrzedmiotZamowienia() {
        return przedmiotZamowienia;
    }

    public void setPrzedmiotZamowienia(String przedmiotZamowienia) {
        this.przedmiotZamowienia = przedmiotZamowienia;
    }

    public String getTypPrzetargu() {
        return typPrzetargu;
    }

    public void setTypPrzetargu(String typPrzetargu) {
        this.typPrzetargu = typPrzetargu;
    }

    public String getFormaPostepowania() {
        return formaPostepowania;
    }

    public void setFormaPostepowania(String formaPostepowania) {
        this.formaPostepowania = formaPostepowania;
    }

    public Long getOkresMc() {
        return okresMc;
    }

    public void setOkresMc(Long okresMc) {
        this.okresMc = okresMc;
    }

    public Long getDlugoscUmowy() {
        return dlugoscUmowy;
    }

    public void setDlugoscUmowy(Long dlugoscUmowy) {
        this.dlugoscUmowy = dlugoscUmowy;
    }

    public Long getTerminPlatnosciDni() {
        return terminPlatnosciDni;
    }

    public void setTerminPlatnosciDni(Long terminPlatnosciDni) {
        this.terminPlatnosciDni = terminPlatnosciDni;
    }

    public String getWynikOceny() {
        return wynikOceny;
    }

    public void setWynikOceny(String wynikOceny) {
        this.wynikOceny = wynikOceny;
    }

    public String getProgowy() {
        return progowy;
    }

    public void setProgowy(String progowy) {
        this.progowy = progowy;
    }

    public String getResponsiblePersonFormal() {
        return responsiblePersonFormal;
    }

    public void setResponsiblePersonFormal(String responsiblePersonFormal) {
        this.responsiblePersonFormal = responsiblePersonFormal;
    }

    public String getfArchiwalny() {
        return fArchiwalny;
    }

    public void setfArchiwalny(String fArchiwalny) {
        this.fArchiwalny = fArchiwalny;
    }

    public String getNumerPakietu() {
        return numerPakietu;
    }

    public void setNumerPakietu(String numerPakietu) {
        this.numerPakietu = numerPakietu;
    }

    public BigDecimal getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(BigDecimal priorytet) {
        this.priorytet = priorytet;
    }

    public String getParticipate() {
        return participate;
    }

    public void setParticipate(String participate) {
        this.participate = participate;
    }
}
