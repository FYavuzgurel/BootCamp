package kodlamaio.BootCamp.business.abstracts;

import java.util.List;

import kodlamaio.BootCamp.core.utilities.result.DataResult;
import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.core.utilities.result.SuccessDataResult;
import kodlamaio.BootCamp.entity.concretes.Product;
import kodlamaio.BootCamp.entity.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	
	public DataResult<Product> getByProductName(String productName); //
	public DataResult<Product> getByProductNameAndCategory(String productName,int categoryId); //
	public DataResult<List<Product>> getByProductNameOrCategory(String productName,int categoryId); //  
	//public DataResult<List<Product>> getByProductNameIn(List<Integer> categories);  
	public DataResult<List<Product>> getByProductNameContains(String productName); //
	public DataResult<List<Product>> getByProductNameStartsWith(String productName); //
	public DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories); //
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	public DataResult<List<Product>> getProductNameByCategory_CategoryId(int categoryId);
}
