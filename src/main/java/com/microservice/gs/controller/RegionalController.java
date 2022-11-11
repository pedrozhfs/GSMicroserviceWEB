package com.microservice.gs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.microservice.gs.model.Regional;
import com.microservice.gs.repository.RegionalRepository;

@Controller
public class RegionalController {
	@Autowired
	private RegionalRepository repo;
	
	@GetMapping("/regional")
	public String homePage(Model model) {
		model.addAttribute("regionallista", repo.findAll());
		return "regional";
	}
	
	@GetMapping("/saveRegionalPage")
	public String saveRegionalPage(Model model) {
		Regional regional= new Regional();
		model.addAttribute("regional", regional);
		return "add_regional";
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/saveRegional")
	public String saveRegional(@ModelAttribute("regional") Regional regional) {
		repo.save(regional);
		return "add_regional";
	}
	
	@GetMapping("/updateRegionalPage/{id}")
	public String showUpdateRegionalPage(@PathVariable("id") Long id, Model model) {
		Optional<Regional> temp=repo.findById(id);
		Regional regional=temp.get();
		model.addAttribute("regional",regional);
		return "update_regional";
	}
	
	@GetMapping("/deleteRegional/{id}")
	public String deleteRegional(@PathVariable("id") Long id) {
		
		repo.deleteById(id);
		return "redirect:/regional";
	}
}
