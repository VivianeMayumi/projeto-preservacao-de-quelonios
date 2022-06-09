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
@Table(name="viagem_eclosao")
public class ViagemEclosao implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_eclosao")
	private Integer idEclosao;	

	@NotBlank
	@Column(name = "numero_cova")
	private String numeroCova;
	
	/*TODO*/
	@NotBlank
	@Column(name = "data_nascimento")
	private Date dataNascimento;	
	
	@NotBlank
	@Column(name = "especie")
	private String especie;

	@NotBlank
	@Column(name = "quantidade_filhote_vivo")
	private Integer quantidadeFilhoteVivo;

	@NotBlank
	@Column(name = "quantidade_ovo_inviavel")
	private Integer quantidadeOvoInviavel ;	

	@NotBlank
	@Column(name = "quantidade_ovo_infertil")
	private double quantidadeOvoInfertil ;

	@NotBlank
	@Column(name = "quantidade_filhote_morto_formiga")
	private double quantidadeFilhoteMortoFormiga;

	@NotBlank
	@Column(name = "quantidade_filhote_morto_bicheira")
	private float quantidadeFilhoteMortoBicheira;

	@NotBlank
	@Column(name = "quantidade_filhote_morto_outros")
	private float quantidadeFilhoteMortoOutros;
	
	 /*TODO*/
	private Integer fkIdViagem ;
	
}
