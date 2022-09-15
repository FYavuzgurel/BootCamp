package kodlamaio.BootCamp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.BootCamp.core.utilities.result.Result;
import kodlamaio.BootCamp.entity.concretes.Product;
import kodlamaio.BootCamp.entity.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory(String productName,int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);
	
	//List<Product> getByProductNameIn(List<Integer> categories);  
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	//List<Product> getByNameAndCategory(String productName, int categoryId);
	
//	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
//	List<Product> getByNameAndCategory(String productName,int categoryId);
	
	@Query("Select new kodlamaio.BootCamp.entity.dtos.ProductWithCategoryDto" + 
	"(p.id,p.productName,c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	
	 
}
