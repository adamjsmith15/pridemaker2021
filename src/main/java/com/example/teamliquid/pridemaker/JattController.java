package com.example.teamliquid.pridemaker;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.teamliquid.pridemaker.entity.organization.OrganizationRoot;
import com.example.teamliquid.pridemaker.entity.orgsummary.OrgSummaryRoot;

@Controller
public class JattController {
	PrideMakerRestTemplate restTemplate = new PrideMakerRestTemplate();
	

	String apiKey = "fb7476e91417e0848a9d4467d465004e";

	
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
		System.out.println(companyResponse.getBody().getOrganizationResponse().getOrganization().size());
		
		mv.addObject("root", companyResponse.getBody().getOrganizationResponse().getOrganization());


		
		return mv;
		
	}
	
	@RequestMapping("/searchorgsummary")
	public ModelAndView searchOrgSummary(@RequestParam("id") String id) {
		ModelAndView mv = new ModelAndView("orgsummary");
		
		String url ="https://www.opensecrets.org/api/?method=orgSummary&id=" + id + "&apikey=" + apiKey + "&output=json";
		System.out.println(url);
		
		// get header and info for company
		HttpHeaders headersCompany = new HttpHeaders();
		headersCompany.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> orgEntity = new HttpEntity<>("parameters", headersCompany);
		ResponseEntity<OrgSummaryRoot> orgResponse = restTemplate.exchange(url, HttpMethod.GET, orgEntity, OrgSummaryRoot.class);
		mv.addObject("summary",orgResponse.getBody().getResponse().getOrganization().getAttributes());
		return mv;
	}

}
