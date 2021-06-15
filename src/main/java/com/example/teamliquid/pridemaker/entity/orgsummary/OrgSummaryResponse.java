package com.example.teamliquid.pridemaker.entity.orgsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgSummaryResponse {
	private OrgSummary organization;
	
	public OrgSummaryResponse() {
		super();
	}

	public OrgSummary getOrganization() {
		return organization;
	}

	public void setOrganization(OrgSummary orgSummary) {
		this.organization = orgSummary;
	}

}
