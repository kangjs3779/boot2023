package com.example.demo.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfig2 {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.formLogin()
			.loginPage("/sub34/mylogin")
			.defaultSuccessUrl("/sub34/loginSuccess", true)
			.usernameParameter("id") //username(기본값)
			.passwordParameter("pw"); //password(기본값)
		//13번 라인이 없었을 때에는 아무것도 뜨지 않다가 로그인 필터가 설정이 된 것이다 -> 그럼 로그인 페이지가 뜸!!
		//defaultSuccessUrl("/list") = (로그인 페이지로 바로 감)로그인을 하면 /list로 간다.
		//login페이지로 바로감 -> 로그인함 -> 그럼 list로 간다.
		http.csrf().disable(); // 이걸 쓰면 <sec:csrfInput/>의 의미가 사라진다 
		
		http.authorizeHttpRequests().requestMatchers("/abc").authenticated();
		//16번 해석 : abc라는 경로는 로그인을 해야지만(인증된 유저만) 갈 수 있다는 필터를 넣어준 것이다.
		//요청을 /abc로 보냄 -> 그럼 로그인페이지로 redirect됨 -> 로그인하고 인증이 되면 /abc로 보내줌
		//근데 13번 라인에 trFue로 두면
		// /abc로 요청을 보냄 -> 로그인 페이지로 redirect -> 로그인함 -> /list로 감
		http.authorizeHttpRequests().anyRequest().permitAll();
		// abc 요청말고는 어떤 요청이든지 다 허용한다 = abc는 로그인을 했을 때만 가능하고 다른 애들은 다 가능
		
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		//필터들이 설정이 되었고 이걸 통ㄹ해서 DB에 있는 실제 아이디와패스워드를 가져온다
		PasswordEncoder encoder = passwordEncoder();
		
		String pw1 = encoder.encode("pw1");
		String pw2 = encoder.encode("pw2");
		// pw1, pw2라는 평문이 암호화를 해주는 코드이다
		
		UserDetails user1 = User.builder()
				.username("user1")
				.password(pw1)
				.authorities(List.of())
				.build();
		UserDetails user2 = User.builder()
				.username("user2")
				.password(pw2)
				.authorities(List.of())
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		//passwordEncoder = 기본 패스워드는 노출되면 위험하니까 encoder(암호화)를 함
		return new BCryptPasswordEncoder();
	}
}







