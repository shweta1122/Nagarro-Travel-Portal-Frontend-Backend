package com.nagarro.sweta.employeetravelmanagement.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().anonymous();
        // security issue tha......ok//direct add//rulo//ye hona nh chaie na waise direct add?...haa toh usska code likhna..thrrk
    }
}