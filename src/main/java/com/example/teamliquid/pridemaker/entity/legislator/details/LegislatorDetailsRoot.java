package com.example.teamliquid.pridemaker.entity.legislator.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorDetailsRoot {
	private LegislatorDetailsResponse response;

	public LegislatorDetailsRoot() {
		super();
	}

	public LegislatorDetailsResponse getResponse() {
		return response;
	}

	public void setResponse(LegislatorDetailsResponse response) {
		this.response = response;
	}
	

}
