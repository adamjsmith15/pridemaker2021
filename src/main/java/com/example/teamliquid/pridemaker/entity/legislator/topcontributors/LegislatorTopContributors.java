package com.example.teamliquid.pridemaker.entity.legislator.topcontributors;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LegislatorTopContributors {
	@JsonProperty("@attributes") 
    private LegislatorTopContributorsAttributes attributes;
	private List<LegislatorTopContributor> contributor;

	public LegislatorTopContributors() {
		super();
	}

	public LegislatorTopContributorsAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(LegislatorTopContributorsAttributes attributes) {
		this.attributes = attributes;
	}

	public List<LegislatorTopContributor> getContributor() {
		return contributor;
	}

	public void setContributor(List<LegislatorTopContributor> contributor) {
		this.contributor = contributor;
	}

}
