package br.com.cursojsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "beanPessoa")
public class BeanPessoa {

	//atributos que serão recebidos da tela
	private String nome;
	private String sobrenome;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
