package com.vincenzoracca.springresourceserver.api;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SecurityRequirement(name = "bearerAuth")
@RestController
public class HelloWordApi {

    @GetMapping
    public String welcome(@Parameter(hidden = true) @AuthenticationPrincipal Jwt jwt) {
        return "Hello World and " + jwt.getSubject();
    }
}
