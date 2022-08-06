package kodlamaio.BootCamp.business.abstracts;

import java.util.List;

import kodlamaio.BootCamp.core.utilities.result.DataResult;
import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.entity.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
