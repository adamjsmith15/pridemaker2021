package com.example.teamliquid.pridemaker.entity.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationAttributes {
	private String orgid;
	private String orgname;
	
	
	public String getOrgname() {
		return orgname;
	}
	
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgid() {
		return orgid;
	}
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}
	@Override
	public String toString() {
		return "Organization [orgname=" + orgname + ", orgid=" + orgid + "]";
	}


}
