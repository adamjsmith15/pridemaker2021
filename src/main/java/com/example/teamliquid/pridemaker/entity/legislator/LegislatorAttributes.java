package com.example.teamliquid.pridemaker.entity.legislator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorAttributes {
    private String cid;
    private String firstlast;
    private String lastname;
    private String party;
    private String office;
    private String gender;
    private String first_elected;
    private String exit_code;
    private String comments;
    private String phone;
    private String fax;
    private String website;
    private String webform;
    private String congress_office;
    private String bioguide_id;
    private String votesmart_id;
    private String feccandid;
    private String twitter_id;
    private String youtube_url;
    private String facebook_id;
    private String birthdate;
    
    
	public LegislatorAttributes() {
		super();
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getFirstlast() {
		return firstlast;
	}
	public void setFirstlast(String firstlast) {
		this.firstlast = firstlast;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirst_elected() {
		return first_elected;
	}
	public void setFirst_elected(String first_elected) {
		this.first_elected = first_elected;
	}
	public String getExit_code() {
		return exit_code;
	}
	public void setExit_code(String exit_code) {
		this.exit_code = exit_code;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getWebform() {
		return webform;
	}
	public void setWebform(String webform) {
		this.webform = webform;
	}
	public String getCongress_office() {
		return congress_office;
	}
	public void setCongress_office(String congress_office) {
		this.congress_office = congress_office;
	}
	public String getBioguide_id() {
		return bioguide_id;
	}
	public void setBioguide_id(String bioguide_id) {
		this.bioguide_id = bioguide_id;
	}
	public String getVotesmart_id() {
		return votesmart_id;
	}
	public void setVotesmart_id(String votesmart_id) {
		this.votesmart_id = votesmart_id;
	}
	public String getFeccandid() {
		return feccandid;
	}
	public void setFeccandid(String feccandid) {
		this.feccandid = feccandid;
	}
	public String getTwitter_id() {
		return twitter_id;
	}
	public void setTwitter_id(String twitter_id) {
		this.twitter_id = twitter_id;
	}
	public String getYoutube_url() {
		return youtube_url;
	}
	public void setYoutube_url(String youtube_url) {
		this.youtube_url = youtube_url;
	}
	public String getFacebook_id() {
		return facebook_id;
	}
	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
    
    

}
