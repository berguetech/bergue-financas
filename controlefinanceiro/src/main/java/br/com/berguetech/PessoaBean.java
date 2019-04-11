/** @author Cristhian Felipe Eichembergue */

package br.com.berguetech;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("unused")
@ViewScoped
@ManagedBean(name = "pessoaBean") //backend
public class PessoaBean {

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