package com.moniumverse.educhip.app.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "MasterOpportunities")
public class MasterOpportunitiesEntity implements Serializable {

	private static final long serialVersionUID = 3211015605171634496L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, length = 50)
	private String opportunityId;

	@Column(nullable = false, length = 100)
	private String opportunityName;
	
	@Column(nullable = false, length = 100)
	private String opportunityCountry;

	@Column(nullable = false, length = 100)
	private String opportunityDeadline;

	@Column(nullable = false, length = 3000)
	private String opportunityDescription;

	@Column(nullable = false, length = 100)
	private String opportunityPeriod;

	@Column(nullable = false, length = 300)
	private String opportunityImageUrl;

	@Column(nullable = false, length = 300)
	private String opportunityUrl;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getOpportunityCountry() {
		return opportunityCountry;
	}

	public void setOpportunityCountry(String opportunityCountry) {
		this.opportunityCountry = opportunityCountry;
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
