package com.mindtree.portal.service;

public class CategoryService {
	 public void addCategory(CategoryBean categoryBean);
	 
	 public List<CategoryBean> getCategories();
	 
	 public CategoryBean getCategory(int categoryId);
	 
	 public void deleteCategory(int categoryId);
}
