package kodlamaio.BootCamp.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="categories")
@AllArgsConstructor
@NoArgsConstructor
public class Category {

	@Id 
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	//@OneToMany(mappedBy = "categories")
	//private List<Product> products;
}
