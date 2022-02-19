package com.vincenzoracca.springoauth2client.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

@RestController
public class WelcomeApi {

    @GetMapping
    public Mono<String> welcome(@AuthenticationPrincipal OidcUser oidcUser, WebSession webSession) {
        System.out.println(webSession.getId());
        String user;
        if(oidcUser == null) {
            user = "";
        }
        else {
            user = oidcUser.getClaimAsString("sub");
        }
        return Mono.just(String.format("Welcome to Spring Cloud Gateway %s", user));
    }
}
