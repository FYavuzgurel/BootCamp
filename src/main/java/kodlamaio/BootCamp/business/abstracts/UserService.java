package kodlamaio.BootCamp.business.abstracts;

import kodlamaio.BootCamp.core.entities.User;
import kodlamaio.BootCamp.core.utilities.result.DataResult;
import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.entity.concretes.Product;

public interface UserService {
	Result add(User user);
	public DataResult<User> findByEmail(String email);
}
