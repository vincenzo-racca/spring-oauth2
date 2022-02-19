package com.vincenzoracca.springresourceserver.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordApi {

    @GetMapping
    public String welcome(@AuthenticationPrincipal Jwt jwt) {
        return "Hello World and " + jwt.getSubject();
    }
}
