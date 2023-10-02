/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.patrones.disenno.comportamiento.chainOfResponsability.request.RequestChainOfResponsability;

/**
 * 
 */
@Controller
public class ControllerRembolso {

	@GetMapping("/homeSolicitudRembolso")
	public String searchHome(Model model) {
		return "HomeSolicitudRembolso"; // Return the name of your Thymeleaf template
	}

	// Metodo para inicializar el formulario
	@GetMapping("/createFileForm")
	public String createFileForm(Model model) {
		model.addAttribute("chainOfResponsability", new RequestChainOfResponsability());
		return "homeSolicitudRembolso";
	}

	// Accion para ejecutar solicitat rembolso
	@PostMapping("/solicitarRembolso")
	public String solicitarRembolso(RequestChainOfResponsability chainOfResponsability) {
		return "redirect:/solicitudRembolso";
	}
}
