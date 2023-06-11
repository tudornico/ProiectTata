package com.example.usermanagement.Model;

import com.example.usermanagement.Model.LogIn.JwtTokenUnit;
import com.example.usermanagement.Service.JwtService;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {
    @Autowired
    private JwtService service;

    @Autowired
    private JwtTokenUnit tokenUnit;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String requestTokenHeader = request.getHeader("Authorization");

        String username = null;
        String jwtToken = null;

        if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer")){
            jwtToken = requestTokenHeader.substring(7);
            try {
                username = JwtTokenUnit.getUsernameFromToken(jwtToken);
            }
            catch (IllegalArgumentException e ){
                System.out.println("Unable to get Jwt Token");
            }
            catch (ExpiredJwtException e){
                System.out.println("Expired token");
            }
        }
        else{
            logger.warn("JWT token does not being with bearer string ");
        }

        if(username != null && SecurityContextHolder.getContext().getAuthentication() != null){
            UserDetails userDetails = this.service.loadUserByUsername(username);

            if(tokenUnit.validateToken(jwtToken , userDetails)){
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails , null ,userDetails. getAuthorities()
                );
                usernamePasswordAuthenticationToken.setDetails(userDetails);
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
        filterChain.doFilter(request , response);
    }
}
