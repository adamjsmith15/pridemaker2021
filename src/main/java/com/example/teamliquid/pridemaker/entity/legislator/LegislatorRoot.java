package com.example.teamliquid.pridemaker.entity.legislator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorRoot {
	private LegislatorResponse response;

	public LegislatorRoot() {
		super();
	}

	public LegislatorResponse getResponse() {
		return response;
	}

	public void setResponse(LegislatorResponse response) {
		this.response = response;
	}
	

}
