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

	@GetMapping("/home")
	public String home(Model model) {
		String mensaje = "Bienvenidos";
		model.addAttribute("mensaje", mensaje);
		return "home"; // Return the name of your Thymeleaf template
	}

	// Metodo para inicializar el formulario
	@GetMapping("/createSolicitudForm")
	public String createSolicitudForm(Model model) {
		model.addAttribute("chainOfResponsability", new RequestChainOfResponsability());
		return "homeSolicitudRembolso";
	}

	// Accion para ejecutar solicitat rembolso
	@PostMapping("/solicitarRembolso")
	public String solicitarRembolso(@ModelAttribute RequestChainOfResponsability requestChainOfResponsability) {
		return "redirect:/SolicitudRembolso";
	}
}
