package com.mindtree.portal.dao;

import java.util.List;

import com.mindtree.portal.entity.CategoryBean;

public interface CategoryDao {
	public void addCategory(CategoryBean categoryBean);
	 
	 public List<CategoryBean> getCategories();
	 
	 public CategoryBean getCategory(int categoryId);
	 
	 public void deleteCategory(int categoryId);
}
