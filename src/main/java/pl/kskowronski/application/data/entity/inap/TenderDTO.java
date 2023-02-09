package pl.kskowronski.application.data.entity.inap;

import java.math.BigDecimal;
import java.util.Date;

public class TenderDTO {

    private BigDecimal id;
    private String purchaser;
    private Date dataOgloszenia;
    private Date dataZlozenia;
    private String status;
    private String aktywnosc;
    private String przedmiotZamowienia;
    private String tenderType;
    private String formaPostepowania;
    private Long okresMc;
    private Long dlugoscUmowy;
    private Long terminPlatnosciDni;
    private String wynikOceny;
    private String progowy;
    private String responsiblePersonFormal;
    private String city;
    private String deadlineApplication;
    private Date deadlineSort;
    private String packageNumber;
    private BigDecimal priority;
    private String participate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
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

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeadlineApplication() {
        return deadlineApplication;
    }

    public void setDeadlineApplication(String deadlineApplication) {
        this.deadlineApplication = deadlineApplication;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    public String getParticipate() {
        return participate;
    }

    public void setParticipate(String participate) {
        this.participate = participate;
    }

    public Date getDeadlineSort() {
        return deadlineSort;
    }

    public void setDeadlineSort(Date deadlineSort) {
        this.deadlineSort = deadlineSort;
    }
}
