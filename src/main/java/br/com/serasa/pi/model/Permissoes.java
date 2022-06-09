package br.com.serasa.pi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Entity
@Table(name="permissoes")
public class Permissoes  implements GrantedAuthority,Serializable{	  
	 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_permissoes")
	private Integer idPermissoes;
	
	@Column(name="descricao")
	private String descricao;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}

}
