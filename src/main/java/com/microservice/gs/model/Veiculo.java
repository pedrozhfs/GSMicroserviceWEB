package com.microservice.gs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="veiculos")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marca;
	private String modelo;
	private String placa;
	private int quilometragem;
	
	public Veiculo( String marca, String modelo, String placa, int quilometragem) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.quilometragem = quilometragem;
	}

	
}
