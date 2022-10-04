package com.austin.jwt;

import io.jsonwebtoken.*;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.UUID;

public class TestJWT {

    private final Long time = (long) (1000 * 60 * 60 * 24);
                                // ms -> s -> min- > hour -> day
    private String signature = "admin";

    @Test
    public void generate_test() {
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                // header
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "tom")
                // payload
                .claim("username", "tom")
                .claim("role", "admin")
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .setId(UUID.randomUUID().toString())
                // signature
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();

        System.out.println(jwtToken);
        // eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InRvbSIsInJvbGUiOiJhZG1pbiIsInN1YiI6ImFkbWluLXRlc3QiLCJleHAiOjE2NjQ5OTQ2NDUsImp0aSI6IjkzZWZiMzEzLWJkNDktNDZhMS04MDFjLTc1YzRlMmUxNTAzMCJ9.A21_nNbN84JONcaHPY5esm91uADRDm_uPHS_njEVZGY
    }

    @Test
    public void parse_test() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InRvbSIsInJvbGUiOiJhZG1pbiIsInN1YiI6ImFkbWluLXRlc3QiLCJleHAiOjE2NjQ5OTQ2NDUsImp0aSI6IjkzZWZiMzEzLWJkNDktNDZhMS04MDFjLTc1YzRlMmUxNTAzMCJ9.A21_nNbN84JONcaHPY5esm91uADRDm_uPHS_njEVZGY";
        JwtParser jwtParser = Jwts.parser();
        Jws<Claims> claimsJws = jwtParser.setSigningKey(signature).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();

        System.out.println(claims.get("username"));
        System.out.println(claims.get("role"));
        System.out.println(claims.getId());
        System.out.println(claims.getSubject());
        System.out.println(claims.getExpiration());

    }

}
