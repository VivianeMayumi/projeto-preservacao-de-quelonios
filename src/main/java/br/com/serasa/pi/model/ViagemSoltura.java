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
@Table(name="viagem_soltura")
public class ViagemSoltura implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_soltura")
	private Integer idSoltura;	

	@NotBlank
	@Column(name = "numero_animal")
	private String numeroAnimal;
	
	@NotBlank
	@Column(name = "especie")
	private String especie;
	
	/*TODO*/
	@NotBlank
	@Column(name = "data_soltura")
	private Date dataSoltura;

	@NotBlank
	@Column(name = "carapaca_comprimento")
	private float carapacaComprimento;

	@NotBlank
	@Column(name = "carapaca_largura")
	private float carapacaLargura;

	@NotBlank
	@Column(name = "plastrao_comprimento")
	private float plastraoComprimento;

	@NotBlank
	@Column(name = "plastrao_largura")
	private float plastraoLargura ;

	@NotBlank
	@Column(name = "peso")
	private float peso;

	@NotBlank
	@Column(name = "altura")
	private float altura;
	
	 /*TODO*/
	private Integer fkIdViagem ;
}
