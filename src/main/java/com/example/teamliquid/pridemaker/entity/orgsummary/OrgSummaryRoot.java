package com.example.teamliquid.pridemaker.entity.orgsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgSummaryRoot {
	private OrgSummaryResponse response;
	
	

	public OrgSummaryRoot() {
		super();
	}

	public OrgSummaryResponse getResponse() {
		return response;
	}

	public void setResponse(OrgSummaryResponse response) {
		this.response = response;
	}
	

}
