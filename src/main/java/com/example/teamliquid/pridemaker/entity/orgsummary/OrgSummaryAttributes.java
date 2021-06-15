package com.example.teamliquid.pridemaker.entity.orgsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgSummaryAttributes {
    public String cycle;
    public String orgid;
    public String orgname;
    public String total;
    public String indivs;
    public String pacs;
    public String soft;
    public String tot527;
    public String dems;
    public String repubs;
    public String lobbying;
    public String outside;
    public String mems_invested;
    public String gave_to_pac;
    public String gave_to_party;
    public String gave_to_527;
    public String gave_to_cand;
    public String source;
    
	public OrgSummaryAttributes() {
		super();
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getIndivs() {
		return indivs;
	}

	public void setIndivs(String indivs) {
		this.indivs = indivs;
	}

	public String getPacs() {
		return pacs;
	}

	public void setPacs(String pacs) {
		this.pacs = pacs;
	}

	public String getSoft() {
		return soft;
	}

	public void setSoft(String soft) {
		this.soft = soft;
	}

	public String getTot527() {
		return tot527;
	}

	public void setTot527(String tot527) {
		this.tot527 = tot527;
	}

	public String getDems() {
		return dems;
	}

	public void setDems(String dems) {
		this.dems = dems;
	}

	public String getRepubs() {
		return repubs;
	}

	public void setRepubs(String repubs) {
		this.repubs = repubs;
	}

	public String getLobbying() {
		return lobbying;
	}

	public void setLobbying(String lobbying) {
		this.lobbying = lobbying;
	}

	public String getOutside() {
		return outside;
	}

	public void setOutside(String outside) {
		this.outside = outside;
	}

	public String getMems_invested() {
		return mems_invested;
	}

	public void setMems_invested(String mems_invested) {
		this.mems_invested = mems_invested;
	}

	public String getGave_to_pac() {
		return gave_to_pac;
	}

	public void setGave_to_pac(String gave_to_pac) {
		this.gave_to_pac = gave_to_pac;
	}

	public String getGave_to_party() {
		return gave_to_party;
	}

	public void setGave_to_party(String gave_to_party) {
		this.gave_to_party = gave_to_party;
	}

	public String getGave_to_527() {
		return gave_to_527;
	}

	public void setGave_to_527(String gave_to_527) {
		this.gave_to_527 = gave_to_527;
	}

	public String getGave_to_cand() {
		return gave_to_cand;
	}

	public void setGave_to_cand(String gave_to_cand) {
		this.gave_to_cand = gave_to_cand;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
    
    

}
