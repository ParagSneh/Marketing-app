package com.marketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {

	@RequestMapping("/viewPageLead")
	public String viewSaveLeadPage() {
		return "new_lead";
	}

}
