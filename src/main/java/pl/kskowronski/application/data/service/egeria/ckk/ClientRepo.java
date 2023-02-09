package pl.kskowronski.application.data.service.egeria.ckk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.kskowronski.application.data.entity.egeria.ckk.Client;

import java.math.BigDecimal;
import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, BigDecimal> {

    @Query("select c from Client c where c.klKod = :klKod and c.kldZatwierdzony = 'T'")
    Optional<Client> getClientByKlKod(@Param("klKod") BigDecimal klKod);
}
