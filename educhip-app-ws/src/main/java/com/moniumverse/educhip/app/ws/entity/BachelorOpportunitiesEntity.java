package com.moniumverse.educhip.app.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "BachelorOpportunities")
public class BachelorOpportunitiesEntity implements Serializable {


	private static final long serialVersionUID = -8426097308622556979L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String opportunityId;

	@Column(nullable = false, length = 50)
	private String opportunityName;

	@Column(nullable = false, length = 30)
	private String opportunityDeadline;

	@Column(nullable = false, length = 120)
	private String opportunityDescription;

	@Column(nullable = false, length = 30)
	private String opportunityPeriod;

	@Column(nullable = false, length = 80)
	private String opportunityImageUrl;

	@Column(nullable = false, length = 80)
	private String opportunity_url;

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
