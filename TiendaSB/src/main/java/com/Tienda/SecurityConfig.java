/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Derek
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    //Se definen los usuaarios del sistema en formato de memoria.
    @Bean
    public UserDetailsService users(){
        UserDetails admin = User.builder()
                .username("juan")
                .password("{noop}123")
                .roles("USER","VENDEDOR","ADMIN")
                .build();
        
        UserDetails vendedor = User.builder()
                .username("rebeca")
                .password("{noop}456")
                .roles("VENDEDOR","ADMIN")
                .build();
        
        UserDetails usuario = User.builder()
                .username("pedro")
                .password("{noop}789")
                .roles("ADMIN")
                .build();
        
        return new InMemoryUserDetailsManager(usuario,vendedor,admin);
    }//fin userDetailService
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
        http
                .authorizeHttpRequests((request) -> request
                        //---index---
                        .requestMatchers("/",
                                "/index",
                                "/errores/**",
                                "/webjars/**").permitAll()
                        //---articulo----
                        .requestMatchers("/articulo/nuevo",
                                "/articulo/guardar",
                                "/articulo/modificar",
                                "articulo/eliminar")
                        .hasRole("admin")
                        //--- ---
                );
        return http.build();    
    }//fin securityfilter
    
}//fin main class
