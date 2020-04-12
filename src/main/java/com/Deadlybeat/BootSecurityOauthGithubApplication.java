package com.Deadlybeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class BootSecurityOauthGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecurityOauthGithubApplication.class, args);
	}

}
