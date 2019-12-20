package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

//@RequestScoped 
@ViewScoped
@ManagedBean(name = "beanPessoa")
public class BeanPessoa {

	private String nome;	
	private List<String> nomes = new ArrayList<String>();
	
	
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public String addNome() {
		nomes.add(nome);
		return "";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
