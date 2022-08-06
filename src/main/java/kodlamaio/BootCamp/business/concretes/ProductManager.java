package kodlamaio.BootCamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.BootCamp.business.abstracts.ProductService;
import kodlamaio.BootCamp.core.utilities.result.DataResult;
import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.core.utilities.result.SuccessDataResult;
import kodlamaio.BootCamp.core.utilities.result.SuccessResult;
import kodlamaio.BootCamp.dataAccess.abstracts.ProductDao;
import kodlamaio.BootCamp.entity.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll(){
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
