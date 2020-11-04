package br.com.nt.springmongo.dto;

import java.io.Serializable;

import br.com.nt.springmongo.domain.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String nome;
	private String email;

	public UserDTO() {
	}

	public UserDTO(User user) {

		this.id = user.getId();
		this.nome = user.getName();
		this.email = user.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

}
