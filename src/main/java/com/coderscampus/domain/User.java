package com.coderscampus.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
  private Long userId;
  private String username;
  private String password;
  private Set<Authorities> authorities = new HashSet<>();
  
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long id) {
    this.userId = id;
  }
  public String getUserName() {
    return username;
  }
  public void setUserName(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="user")
  public Set<Authorities> getAuthorities() {
    return authorities;
  }
  public void setAuthorities(Set<Authorities> authorities) {
    this.authorities = authorities;
  }
}
