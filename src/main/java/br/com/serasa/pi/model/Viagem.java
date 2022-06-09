package br.com.serasa.pi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name="viagem")
public class Viagem implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_viagem")
	private Integer idViagem;

	@NotBlank
	@Column(name = "data_viagem")
	private Date dataViagem;

	@NotBlank
	@Column(name = "estado_UF")
	private String estadoUF;

	@NotBlank
	@Column(name = "municipio")
	private String municipio;
	
	@NotBlank
	@Column(name = "comunidade")
	private String comunidade;
	
	/*TODO*/
	private enum tipoViagem{COLETA, ECLOSAO, SOLTURA};	
	private String fkCoordenador;
	
	

}
