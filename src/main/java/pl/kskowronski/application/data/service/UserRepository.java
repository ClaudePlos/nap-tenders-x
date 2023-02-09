package pl.kskowronski.application.data.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.kskowronski.application.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, BigDecimal>, JpaSpecificationExecutor<User> {

    //@Query("select u from User u where u.username = :username")
    User findByUsername(@Param("username") String username);

}
