package com.mindtree.portal.service;

import java.util.List;

import com.mindtree.portal.entity.PublicationBean;

public interface PortalService {
	public void addPublication(PublicationBean publicationBean);
	 
	 public List<PublicationBean> getPublications();
	 
	 public PublicationBean getPublication(int pubId);
	 
	 public void deletePublication(int pubId);
}
