package com.example.jwt.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jwt.config.JwtConfig;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenProvider {


    @Autowired
    private JwtConfig jwtConfig;


    public String createToken(String username) {

        Claims claims = Jwts.claims()
                .setSubject(username);

        Date now = new Date();

        Date expiry = new Date(now.getTime() + 3600000);


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(expiry)
                .signWith(
                        SignatureAlgorithm.HS256,
                        jwtConfig.getSecret()
                )
                .compact();
    }


    public boolean validateToken(String token) {

        try {

            Jwts.parser()
                    .setSigningKey(jwtConfig.getSecret())
                    .parseClaimsJws(token);

            return true;

        } catch (Exception e) {

            return false;

        }

    }


    public String getUsername(String token) {

        return Jwts.parser()
                .setSigningKey(jwtConfig.getSecret())
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

}