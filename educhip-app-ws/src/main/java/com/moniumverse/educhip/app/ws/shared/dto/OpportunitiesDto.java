package com.moniumverse.educhip.app.ws.shared.dto;

import java.io.Serializable;

public class OpportunitiesDto implements Serializable {


	private static final long serialVersionUID = -7445156424764853849L;
	private long id;
	
	private String opportunityType;
	private String opportunityId;
	private String opportunityName;
	private String opportunityCountry;
	private String opportunityDeadline;
	private String opportunityDescription;
	private String opportunityPeriod;
	private String opportunityImageUrl;
	private String opportunityUrl;

	public String getOpportunityCountry() {
		return opportunityCountry;
	}

	public void setOpportunityCountry(String opportunityCountry) {
		this.opportunityCountry = opportunityCountry;
	}

	public String getOpportunityType() {
		return opportunityType;
	}

	public void setOpportunityType(String opportunityType) {
		this.opportunityType = opportunityType;
	}

	public String getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
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

	public String getOpportunityUrl() {
		return opportunityUrl;
	}

	public void setOpportunityUrl(String opportunityUrl) {
		this.opportunityUrl = opportunityUrl;
	}


}
