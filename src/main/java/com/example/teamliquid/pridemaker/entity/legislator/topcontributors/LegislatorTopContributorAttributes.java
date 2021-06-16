package com.example.teamliquid.pridemaker.entity.legislator.topcontributors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorTopContributorAttributes {
	private String org_name;
    private String total;
    private String pacs;
    private String indivs;
    
    
	public LegislatorTopContributorAttributes() {
		super();
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getPacs() {
		return pacs;
	}
	public void setPacs(String pacs) {
		this.pacs = pacs;
	}
	public String getIndivs() {
		return indivs;
	}
	public void setIndivs(String indivs) {
		this.indivs = indivs;
	}

	
    

}
