package br.com.serasa.pi.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Entity
@Table(name = "voluntario")
public class Voluntario implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="matricula")
	private Integer matricula;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email", unique=true)
	private String email;		
	
	@Column(name="senha")
	private String senha;
	
	/*TODO*/
	private Integer fkIdPermissoes;
	
	@Column(name="account_non_expired")
	private Boolean accountNonExpired;
	
	@Column(name="account_non_locked")
	private Boolean accountNonLocked;
	
	@Column(name="credentials_non_expired")
	private Boolean credentialsNonExpired;
	
	@Column(name="enabled")
	private Boolean enabled;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
