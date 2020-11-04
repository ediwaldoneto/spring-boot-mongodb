package br.com.nt.springmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nt.springmongo.domain.User;
import br.com.nt.springmongo.repository.UserRepository;
import br.com.nt.springmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		Optional<User> usuario = userRepository.findById(id);
		return usuario.orElseThrow(()-> new ObjectNotFoundException("Objeto nao encontrado"));
	}
}
