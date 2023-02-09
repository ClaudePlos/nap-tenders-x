package pl.kskowronski.application.data.service.inap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.kskowronski.application.data.entity.inap.TenderDate;

import java.math.BigDecimal;
import java.util.Optional;

public interface TenderDateRepo extends JpaRepository<TenderDate, BigDecimal> {

    @Query("select td from TenderDate td where td.przId = :przId and td.kod = 'ZLOZENIE_OFERT' and td.aktualny = 'T'")
    Optional<TenderDate> getTenderDeadline(@Param("przId") BigDecimal przId);

}
