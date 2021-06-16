package com.example.teamliquid.pridemaker.entity.legislator.topcontributors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorTopContributorResponse {
	private LegislatorTopContributors contributors;
	
	

	public LegislatorTopContributorResponse() {
		super();
	}

	public LegislatorTopContributors getContributors() {
		return contributors;
	}

	public void setContributors(LegislatorTopContributors contributors) {
		this.contributors = contributors;
	}
}
