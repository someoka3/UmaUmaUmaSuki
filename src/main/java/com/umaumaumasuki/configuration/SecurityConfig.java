package com.umaumaumasuki.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests
				.anyRequest().permitAll()
			)
			.formLogin((form) -> form
				.loginPage("/login")
				.failureUrl("/login?failure")
				.defaultSuccessUrl("/index")
				.permitAll()
			);

		return http.build();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder()
//								.username("user")
//								.password("userdesu")
//								.roles("USER")
//								.build();
//								
//		return new InMemoryUserDetailsManager(user);
//	}

}
