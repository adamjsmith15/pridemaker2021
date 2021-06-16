package com.example.teamliquid.pridemaker.entity.legislator.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorDetails {
	@JsonProperty("@attributes") 
    private LegislatorDetailsAttributes attributes;

	public LegislatorDetails() {
		super();
	}

	public LegislatorDetailsAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(LegislatorDetailsAttributes attributes) {
		this.attributes = attributes;
	}
	
	

}
