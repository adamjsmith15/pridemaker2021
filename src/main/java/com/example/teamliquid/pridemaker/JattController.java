package com.example.teamliquid.pridemaker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.teamliquid.pridemaker.entity.legislator.LegislatorRoot;
import com.example.teamliquid.pridemaker.entity.legislator.details.LegislatorDetailsRoot;
import com.example.teamliquid.pridemaker.entity.legislator.topcontributors.LegislatorTopContributorRoot;
import com.example.teamliquid.pridemaker.entity.organization.OrganizationRoot;
import com.example.teamliquid.pridemaker.entity.orgsummary.OrgSummaryRoot;

@Controller
public class JattController {
	PrideMakerRestTemplate restTemplate = new PrideMakerRestTemplate();
	@Value("${secret.key}")
	String apiKey;

	
	@RequestMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("index");
	}
	

	@RequestMapping("/companyresults")
	public ModelAndView getCompanyResults(@RequestParam("org") String org) {
		ModelAndView mv = new ModelAndView("companyresults");
		
		String url = "https://www.opensecrets.org/api/?method=getOrgs";
		String input = org;
		
		String finalUrl = url + "&org=" + input + "&apikey=" + apiKey + "&output=json";
		

		// get header and info for company
		HttpHeaders headersCompany = new HttpHeaders();
		headersCompany.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> companyEntity = new HttpEntity<>("parameters", headersCompany);
		ResponseEntity<OrganizationRoot> companyResponse = restTemplate.exchange(finalUrl, HttpMethod.GET, companyEntity, OrganizationRoot.class);
		
		mv.addObject("root", companyResponse.getBody().getOrganizationResponse().getOrganization());


		
		return mv;
		
	}
	
	@RequestMapping("/legislatorsearch")
	public ModelAndView getLeislatorSearch(@RequestParam("legislator") String legislator) {
		ModelAndView mv = new ModelAndView("legislatorsearch");
		
		String url = "https://www.opensecrets.org/api/?method=getLegislators";
		
		String finalUrl = url + "&id=" + legislator + "&apikey=" + apiKey + "&output=json";
		

		// get header and info for company
		HttpHeaders headersCompany = new HttpHeaders();
		headersCompany.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> legislatorEntity = new HttpEntity<>("parameters", headersCompany);
		ResponseEntity<LegislatorRoot> legislatorResponse = restTemplate.exchange(finalUrl, HttpMethod.GET, legislatorEntity, LegislatorRoot.class);
		
		mv.addObject("legislator", legislatorResponse.getBody().getResponse().getLegislator());
	
		return mv;
		
	}
	
	@RequestMapping("/searchorgsummary")
	public ModelAndView searchOrgSummary(@RequestParam("id") String id) {
		ModelAndView mv = new ModelAndView("orgsummary");
		
		String url ="https://www.opensecrets.org/api/?method=orgSummary&id=" + id + "&apikey=" + apiKey + "&output=json";
		
		// get header and info for company
		HttpHeaders headersCompany = new HttpHeaders();
		headersCompany.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> orgEntity = new HttpEntity<>("parameters", headersCompany);
		ResponseEntity<OrgSummaryRoot> orgResponse = restTemplate.exchange(url, HttpMethod.GET, orgEntity, OrgSummaryRoot.class);
		mv.addObject("summary",orgResponse.getBody().getResponse().getOrganization().getAttributes());
		return mv;
	}
	
	@RequestMapping("/getlegislatordetails")
	public ModelAndView getLegislatorDetails(@RequestParam("id") String id) {
		ModelAndView mv = new ModelAndView("legislatordetails");
		
		String summaryUrl ="https://www.opensecrets.org/api/?method=candSummary&cid=" + id + "&cycle=2020&apikey=" + apiKey + "&output=json";
		String topContribUrl ="https://www.opensecrets.org/api/?method=candContrib&cid=" + id + "&cycle=2020&apikey=" + apiKey + "&output=json";
		
		// get header and info for company
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<LegislatorDetailsRoot> legDetResponse = restTemplate.exchange(summaryUrl, HttpMethod.GET, entity, LegislatorDetailsRoot.class);
		ResponseEntity<LegislatorTopContributorRoot> topContribResponse = restTemplate.exchange(topContribUrl, HttpMethod.GET, entity, LegislatorTopContributorRoot.class);
		
		mv.addObject("legdet", legDetResponse.getBody().getResponse().getSummary().getAttributes());
		mv.addObject("contrib", topContribResponse.getBody().getResponse().getContributors().getContributor());
		return mv;
	}
	
	@RequestMapping("/donationpage")
	public ModelAndView donationpage() {
		
		return new ModelAndView("donationpage");
	}

}
