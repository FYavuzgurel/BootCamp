package kodlamaio.BootCamp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.BootCamp.entity.concretes.Category;
import kodlamaio.BootCamp.entity.concretes.Product;

public interface CategoryDao extends JpaRepository<Category, Integer>{

	List<Category> getByCategoryName(String categoryName);
	List<Category> getByCategoryNameContains(String categoryName);
	List<Product> getProductsByCategoryName(String categoryName); 
}
