package com.example.teamliquid.pridemaker.entity.legislator.topcontributors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorTopContributor {
	@JsonProperty("@attributes") 
    private LegislatorTopContributorAttributes attributes;

	public LegislatorTopContributor() {
		super();
	}

	public LegislatorTopContributorAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(LegislatorTopContributorAttributes attributes) {
		this.attributes = attributes;
	}
	
	

}
