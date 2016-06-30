package br.edu.facisa.cwf.reposicao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.facisa.cwf.reposicao.domain.User;
public interface UserRepository extends JpaRepository<User, String> {

	public User findByName(String name);
	
}
