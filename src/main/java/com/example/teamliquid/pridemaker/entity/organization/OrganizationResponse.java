package com.example.teamliquid.pridemaker.entity.organization;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationResponse {
	private ArrayList<Organization> organization;

	public ArrayList<Organization> getOrganization() {
		return organization;
	}

	public void setOrganization(ArrayList<Organization> organization) {
		this.organization = organization;
	}

	public OrganizationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
