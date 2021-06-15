package com.example.teamliquid.pridemaker.entity.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
//TODO maybe need to make this Organization[] ???
/*
 * could make public class MyMessage }
 * @JsonPropery("Organization")
 * private Organization[];
 * |
 * and this class below would be inside this
 */
public class Organization {
	//TODO maybe try @JsonPropery("@attribute")
	@JsonProperty("@attributes")
	OrganizationAttributes attributes;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public OrganizationAttributes getAttributes() {
		return attributes;
	}


	public void setAttributes(OrganizationAttributes attributes) {
		this.attributes = attributes;
	}

}
