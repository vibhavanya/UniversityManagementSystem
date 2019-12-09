package com.mindtree.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.portal.service.PortalService;

@RestController
public class Controller {

	@Autowired
	private PortalService portalservice;
}
