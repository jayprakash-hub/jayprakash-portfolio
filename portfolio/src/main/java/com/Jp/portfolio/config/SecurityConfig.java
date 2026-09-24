package com.Jp.portfolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http
                .authorizeHttpRequests(auth -> auth

                        // ==============================
                        // PUBLIC PORTFOLIO PAGES
                        // ==============================

                        .requestMatchers(
                                "/",
                                "/index.html",

                                "/About.html",
                                "/Skills.html",
                                "/Experience.html",
                                "/Projects.html",
                                "/Achievements.html",
                                "/Education.html",
                                "/Contact.html",

                                "/login.html",
                                "/register.html",

                                "/images/**",
                                "/css/**",
                                "/js/**",
                                "/resume/**"
                        ).permitAll()

                        // ==============================
                        // OTHER PAGES
                        // ==============================

                        .anyRequest().authenticated()
                )

                // ==============================
                // LOGIN
                // ==============================

                .formLogin(form -> form

                        .loginPage("/login.html")

                        .loginProcessingUrl("/login")

                        .defaultSuccessUrl("/", true)

                        .permitAll()
                )

                // ==============================
                // LOGOUT
                // ==============================

                .logout(logout -> logout

                        .logoutSuccessUrl("/")

                        .permitAll()
                );

        return http.build();
    }
}