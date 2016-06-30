package br.edu.facisa.cwf.reposicao.service;

import java.util.List;
import br.edu.facisa.cwf.reposicao.domain.User;

public interface UserService {

	User save(User user);

	User getById(String id);
	
	List<User> listAllUsers();
}
