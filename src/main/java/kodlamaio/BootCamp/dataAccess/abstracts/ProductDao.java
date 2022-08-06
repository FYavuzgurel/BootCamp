package kodlamaio.BootCamp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.BootCamp.entity.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	//Product getByProductName(String productName);
	//Product getByProductNameAndCategoryId(String productName,int categoryId);
	//List<Product> getByProductNameOrCategoryId(String productName,int categoryId);  
	//List<Product> getByProductNameOrIdIn(List<Integer> categories);  
	//List<Product> getByProductNameContains(String productName);
	//List<Product> getByProductNameStartsWith(String productName);
	
	//@Query()
	//List<Product> getByNameAndCategorty(String productName,int categoryId);
	
}
