package com.microservice.gs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ambientes")
public class Ambiente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bairro;
	private String cidade;
	private String estado;
	private String temperatura;
	private String qualidade;
	
	public Ambiente(String bairro, String cidade, String estado, String temperatura, String qualidade) {
		super();
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.temperatura = temperatura;
		this.qualidade = qualidade;
	}
	
	
}
