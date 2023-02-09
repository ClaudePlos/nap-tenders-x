package pl.kskowronski.application.data.entity.inap;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "napwf_termin_przetargu")
public class TenderDate {

    @Id
    @Column(name = "id", nullable = false)
    private BigDecimal id;

    @Column(name = "prz_id", nullable = false)
    private BigDecimal przId;

    private String  kod;

    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    private String aktualny;

    @Column(name="zd_id")
    private BigDecimal zdId ;

    @Column(name="zd_deaktualizujace_id")
    private BigDecimal zdDeaktualizujaceId ;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAktualny() {
        return aktualny;
    }

    public void setAktualny(String aktualny) {
        this.aktualny = aktualny;
    }

    public BigDecimal getZdId() {
        return zdId;
    }

    public void setZdId(BigDecimal zdId) {
        this.zdId = zdId;
    }

    public BigDecimal getZdDeaktualizujaceId() {
        return zdDeaktualizujaceId;
    }

    public void setZdDeaktualizujaceId(BigDecimal zdDeaktualizujaceId) {
        this.zdDeaktualizujaceId = zdDeaktualizujaceId;
    }

    public BigDecimal getPrzId() {
        return przId;
    }

    public void setPrzId(BigDecimal przId) {
        this.przId = przId;
    }
}
