package com.example.teamliquid.pridemaker.entity.legislator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Legislator {
	@JsonProperty("@attributes") 
    private LegislatorAttributes attributes;

	public Legislator() {
		super();
	}

	public LegislatorAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(LegislatorAttributes attributes) {
		this.attributes = attributes;
	}
	
	

}
