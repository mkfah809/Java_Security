package com.coderscampus.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.coderscampus.domain.User;

public class CustomSecurityUser extends User implements UserDetails {


	private static final long serialVersionUID = 1L;

// lazem a7ot dy 3shan spring doesn't get confused 
	// spring works only for non-argument constructors.
public CustomSecurityUser() {}
	
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setUserId(user.getUserId());
		this.setPassword(user.getPassword());
		this.setUserName(user.getUserName());
	}

	

	@Override public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
