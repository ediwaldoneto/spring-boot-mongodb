package br.com.nt.springmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nt.springmongo.domain.User;
import br.com.nt.springmongo.dto.UserDTO;
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
		return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public User formDto(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getNome(), userDTO.getEmail());
	}

	public void delete(String id) {

		userRepository.deleteById(id);
	}

	public User update(User obj) {

		User newUser = findById(obj.getId());
		updateData(newUser, obj);
		return userRepository.save(newUser);

	}

	public void updateData(User user, User obj) {

		user.setName(obj.getName());
		user.setEmail(obj.getEmail());
	}
}
