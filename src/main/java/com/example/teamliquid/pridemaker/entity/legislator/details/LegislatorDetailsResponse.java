package com.example.teamliquid.pridemaker.entity.legislator.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorDetailsResponse {
	private LegislatorDetails summary;
	
	

	public LegislatorDetailsResponse() {
		super();
	}

	public LegislatorDetails getSummary() {
		return summary;
	}

	public void setSummary(LegislatorDetails summary) {
		this.summary = summary;
	}
}
