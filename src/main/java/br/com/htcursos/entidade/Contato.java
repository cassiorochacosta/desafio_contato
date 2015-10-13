package br.com.htcursos.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "tipo")
	private TipoContato tipo;
	private String contato;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TipoContato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContato tipo) {
		this.tipo = tipo;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

}
