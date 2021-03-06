package br.edu.facisa.cwf.reposicao.service;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import br.edu.facisa.cwf.reposicao.domain.User;
import br.edu.facisa.cwf.reposicao.repository.UserRepository;

@Service
@Validated
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	@Autowired
	public UserServiceImpl(final UserRepository repository) {
		this.repository = repository;
	}

	public User getById(String id) {
		return repository.findOne(id);
	}

	public List<User> listAllUsers() {
		return repository.findAll();
	}

	@Transactional
	public User save(@NotNull @Valid final User participant) {

		User existing = repository.findOne(participant.getName());

		return repository.save(participant);
	}

	public UserRepository getRepository() {
		return repository;
	}
}