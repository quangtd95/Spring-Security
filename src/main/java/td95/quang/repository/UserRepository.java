package td95.quang.repository;

import org.springframework.data.repository.CrudRepository;

import td95.quang.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByEmail(String email);
}
