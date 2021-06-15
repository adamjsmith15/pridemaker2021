package com.example.teamliquid.pridemaker.entity.orgsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgSummary {
	@JsonProperty("@attributes") 
    private OrgSummaryAttributes attributes;

	public OrgSummary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrgSummaryAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(OrgSummaryAttributes attributes) {
		this.attributes = attributes;
	}
	
	

}
