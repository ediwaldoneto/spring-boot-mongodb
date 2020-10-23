package br.com.nt.springmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.nt.springmongo.domain.User;
import br.com.nt.springmongo.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {	

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {

		List<User> lista = userService.findAll();
		return ResponseEntity.ok().body(lista);
	}
}
