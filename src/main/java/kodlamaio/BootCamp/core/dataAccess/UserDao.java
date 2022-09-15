package kodlamaio.BootCamp.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.BootCamp.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
