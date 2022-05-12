package com.generation.nomina.initial;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class ScurityConfig extends WebSecurityConfigurerAdapter{

	/*en esta clase configuramos los usuarios que vamos a utilizar*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("mentiroso").password("{noop}123").roles("CHIDO", "USER")
		.and()
		.withUser("geras").password("{noop}1234").roles("USER");
	}

	
	/**/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/empleados").hasRole("USER")
		.antMatchers(HttpMethod.POST, "/empleados").hasRole("CHIDO")
		.antMatchers(HttpMethod.PUT, "/empleados/**").hasRole("CHIDO")
		.antMatchers(HttpMethod.DELETE, "/empleados/**").hasRole("CHIDO")
		.and()
		.csrf().disable()
		.formLogin().disable();
	}
	
	
	

}
