package eCommerce.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import eCom.DAO.CategoryDAO;
import eCom.Model.Category;

@Controller
public class CategoryController {

	CategoryDAO categoryDAO;
	@RequestMapping("/category")
	public String showCategory(Model m){
		
		m.addAttribute("pageinfo", "category");
		return "category";
		
		
	}
	
	@RequestMapping(value="/AddCategory", method=RequestMethod.POST)
	public String addCategory(Model m, @RequestParam("catName") String categoryName, @RequestParam("catDesc") String categoryDesc){
		
		
		
		Category category = new Category();
		
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categoryDesc);
		// System.out.println("-------- Test Code-------");
		
		categoryDAO.addCategory(category); 	// Due to DB Not Mapped that's why #Exception display 
											// addCatogry beans not initialized.
		
		
		// Rest of Code added after DB Integration
		
		// Delete Category
		// 	public boolean deleteCategory(Category category);
		
		// Update Category
		// public boolean updateCategory(Category category);
		
		// List of Category
		// public List<Category> listCategories();
	
		
		m.addAttribute("pageinfo", "category");
		
		return "category";
	}
}
