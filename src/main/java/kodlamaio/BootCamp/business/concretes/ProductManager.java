package kodlamaio.BootCamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.BootCamp.business.abstracts.ProductService;
import kodlamaio.BootCamp.core.utilities.result.DataResult;
import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.core.utilities.result.SuccessDataResult;
import kodlamaio.BootCamp.core.utilities.result.SuccessResult;
import kodlamaio.BootCamp.dataAccess.abstracts.ProductDao;
import kodlamaio.BootCamp.entity.concretes.Category;
import kodlamaio.BootCamp.entity.concretes.Product;
import kodlamaio.BootCamp.entity.dtos.ProductWithCategoryDto;

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

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductName(productName),"Data listelendi");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductNameAndCategory(productName,categoryId),"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		return new SuccessDataResult <List<Product>>
		(this.productDao.getByProductNameOrCategory_CategoryId(productName,categoryId),"Data listelendi");
	}

//	@Override
//	public DataResult<List<Product>> getByProductNameIn(List<Integer> categories) {
//		return new SuccessDataResult <List<Product>>
//		(this.productDao.getByProductNameIn(categories),"Data listelendi");
//	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult <List<Product>>
		(this.productDao.getByProductNameContains(productName),"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult <List<Product>>
		(this.productDao.getByProductNameStartsWith(productName),"Data listelendi");
	}

//	@Override
//	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
//		return new SuccessDataResult <List<Product>>
//		(this.productDao.getByNameAndCategory(productName,categoryId),"Data listelendi");
//	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>> 
		(this.productDao.getByCategoryIn(categories),"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		 
		PageRequest pegeable= PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pegeable).getContent());
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
		
		Sort sort=Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort),"Başarılı");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return new SuccessDataResult<List<ProductWithCategoryDto>>(this.productDao.getProductWithCategoryDetails(),"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getProductNameByCategory_CategoryId(int categoryId) {
		return new SuccessDataResult<List<Product>> 
		(this.productDao.getProductNameByCategory_CategoryId(categoryId),"Data listelendi");
	}
}
