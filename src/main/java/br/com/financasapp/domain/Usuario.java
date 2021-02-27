package br.com.financasapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario", schema = "appfinancas")
@Data
@NoArgsConstructor
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;


	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "nome")
	private String nome;
	
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "senha")
	private String senha;

	
}
