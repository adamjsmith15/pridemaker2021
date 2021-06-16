package com.example.teamliquid.pridemaker.entity.legislator;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorResponse {
	private ArrayList<Legislator> legislator;
	
	

	public LegislatorResponse() {
		super();
	}

	public ArrayList<Legislator> getLegislator() {
		return legislator;
	}

	public void setLegislator(ArrayList<Legislator> legislator) {
		this.legislator = legislator;
	}
}
