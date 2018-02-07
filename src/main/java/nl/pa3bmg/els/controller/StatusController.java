package nl.pa3bmg.els.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.pa3bmg.els.service.StatusService;

@Controller
public class StatusController {
	private StatusService statusService;
	
	public StatusController(StatusService statusService) {
		this.statusService = statusService;
	}
	
	@RequestMapping({"/statuss"})
    public String getStatus(Model model) {
		model.addAttribute("statuss",statusService.findAll());
		return "statuss";
	}
}
