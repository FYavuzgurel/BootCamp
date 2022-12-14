package kodlamaio.BootCamp.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.BootCamp.business.abstracts.UserService;
import kodlamaio.BootCamp.core.dataAccess.UserDao;
import kodlamaio.BootCamp.core.entities.User;
import kodlamaio.BootCamp.core.utilities.result.DataResult;
import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.core.utilities.result.SuccessDataResult;
import kodlamaio.BootCamp.core.utilities.result.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	 
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
	}

}
