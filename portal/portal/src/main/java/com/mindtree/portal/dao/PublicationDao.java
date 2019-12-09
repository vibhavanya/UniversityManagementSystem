package com.mindtree.portal.dao;

import java.util.List;

import com.mindtree.portal.entity.PublicationBean;

public interface PublicationDao {
	public void addPublication(PublicationBean publicationBean);
	 
	 public List<PublicationBean> getPublications();
	 
	 public PublicationBean getPublication(int pubId);
	 
	 public void deletePublication(int pubId);
}
