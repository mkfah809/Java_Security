package com.coderscampus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Authorities implements GrantedAuthority {
	private static final long serialVersionUID = 1L;
	private Long AuthId;
	private String authority;
	private User user;
	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAuthId() {
		return AuthId;
	}

	public void setAuthId(Long authId) {
		AuthId = authId;
	}
}
