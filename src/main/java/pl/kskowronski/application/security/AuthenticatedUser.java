package pl.kskowronski.application.security;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import pl.kskowronski.application.data.entity.User;
import pl.kskowronski.application.data.service.UserRepository;
import com.vaadin.flow.spring.security.AuthenticationContext;
import java.util.Optional;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

@Component
public class AuthenticatedUser {

    private final UserRepository userRepository;

    public AuthenticatedUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private Optional<Authentication> getAuthentication() {
        SecurityContext context = SecurityContextHolder.getContext();
        return Optional.ofNullable(context.getAuthentication())
                .filter(authentication -> !(authentication instanceof AnonymousAuthenticationToken));
    }

    public Optional<User> get() {
        return getAuthentication().map(authentication -> userRepository.findByUsername(authentication.getName()));
    }

    public void logout() {
    //authenticationContext.logout();
    }

}
