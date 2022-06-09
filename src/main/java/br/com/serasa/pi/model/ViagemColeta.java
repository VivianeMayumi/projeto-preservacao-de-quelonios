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
@Table(name = "viagem_coleta")
public class ViagemColeta implements Serializable {
		
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_coleta")
	private Integer idColeta;

	/*TODO*/
	@NotBlank
	@Column(name = "data_coleta")
	private Date dataColeta;
	
	@NotBlank
	@Column(name = "nome_praia_tanuleiro")
	private String nomePraiaTabuleiro;

	@NotBlank
	@Column(name = "numero_cova")
	private Integer numeroCova;

	@NotBlank
	@Column(name = "quantidade_ovos")
	private Integer quantidadeOvos ;

	@NotBlank
	@Column(name = "especie")
	private String especie;

	@NotBlank
	@Column(name = "distancia_agua")
	private double distanciaAgua ;

	@NotBlank
	@Column(name = "distancia_vegetacao")
	private double distanciaVegetacao;

	@NotBlank
	@Column(name = "profundidade_primeiro_ovo")
	private float profundidadePrimeiroOvo;

	@NotBlank
	@Column(name = "profundidade_total")
	private float profundidadeTotal;

	@NotBlank
	@Column(name = "largura_ninho")
	private float larguraNinho;

	@NotBlank
	@Column(name = "largura_patas")
	private float larguraPata;

	@NotBlank
	@Column(name = "largura_entre_patas")
	private float larguraEntrePatas;

	 /*TODO*/
	private Integer fkIdViagem ;



}
