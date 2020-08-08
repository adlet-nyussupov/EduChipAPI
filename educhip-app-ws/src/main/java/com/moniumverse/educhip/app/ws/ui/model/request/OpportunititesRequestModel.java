package com.moniumverse.educhip.app.ws.ui.model.request;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class OpportunititesRequestModel {
	
	private String opportunityType;
	private String opportunityName;
	private String opportunityDeadline;
	private String opportunityDescription;
	private String opportunityPeriod;
	private String opportunityImageUrl;
	private String opportunity_url;



	public String getOpportunityType() {
		return opportunityType;
	}

	public void setOpportunityType(String opportunityType) {
		this.opportunityType = opportunityType;
	}

	public String getOpportunityName() {
		return opportunityName;
	}

	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}

	public String getOpportunityDeadline() {
		return opportunityDeadline;
	}

	public void setOpportunityDeadline(String opportunityDeadline) {
		this.opportunityDeadline = opportunityDeadline;
	}

	public String getOpportunityDescription() {
		return opportunityDescription;
	}

	public void setOpportunityDescription(String opportunityDescription) {
		this.opportunityDescription = opportunityDescription;
	}

	public String getOpportunityPeriod() {
		return opportunityPeriod;
	}

	public void setOpportunityPeriod(String opportunityPeriod) {
		this.opportunityPeriod = opportunityPeriod;
	}

	public String getOpportunityImageUrl() {
		return opportunityImageUrl;
	}

	public void setOpportunityImageUrl(String opportunityImageUrl) {
		this.opportunityImageUrl = opportunityImageUrl;
	}

	public String getOpportunity_url() {
		return opportunity_url;
	}

	public void setOpportunity_url(String opportunity_url) {
		this.opportunity_url = opportunity_url;
	}

	

}
