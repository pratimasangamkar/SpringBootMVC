package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/playagame")
	public String playGame(@RequestParam(name="choice", required = false) String theChoice, Model model ) {
		
		if(theChoice == null) {
			return "index";
		}
		String output = "error";
		if(theChoice.equals("rock")) {
			output = "tie";
		}else if(theChoice.equals("paper")) {
			output = "win";
		}else if(theChoice.equals("scissors")) {
			output = "loss";
		}
		model.addAttribute("output",output);
		return "results";
		
		
	}

}
