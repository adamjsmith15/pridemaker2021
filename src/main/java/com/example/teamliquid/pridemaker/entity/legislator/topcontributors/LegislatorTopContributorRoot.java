package com.example.teamliquid.pridemaker.entity.legislator.topcontributors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorTopContributorRoot {
	private LegislatorTopContributorResponse response;

	public LegislatorTopContributorRoot() {
		super();
	}

	public LegislatorTopContributorResponse getResponse() {
		return response;
	}

	public void setResponse(LegislatorTopContributorResponse response) {
		this.response = response;
	}
	

}
