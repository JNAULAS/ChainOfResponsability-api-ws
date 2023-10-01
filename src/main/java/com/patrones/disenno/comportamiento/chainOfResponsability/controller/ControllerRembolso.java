/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.patrones.disenno.comportamiento.chainOfResponsability.request.RequestChainOfResponsability;

/**
 * 
 */
@Controller
public class ControllerRembolso {
	
    @GetMapping("/createFileForm")
    public String createFileForm(Model model) {
        model.addAttribute("requestChainOfResponsability", new RequestChainOfResponsability());
        return "solicitudRembolso";
    }

	@PostMapping("/crearSolicitudRembolso")
	public String createFile(@ModelAttribute RequestChainOfResponsability requestChainOfResponsability) {
		return "redirect:/solicitudRembolso"; // Redirect to the form after creating the vehicle.
	}
}
