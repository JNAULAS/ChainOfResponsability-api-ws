/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.model;

import com.patrones.disenno.comportamiento.chainOfResponsability.request.RequestChainOfResponsability;

/**
 * 
 */
public class ManejadorSupervisor extends ManejadorRembolsoBase {

	@Override
	public void manjeadorSolicitudes(RequestChainOfResponsability requestChainOfResponsability) {
		// TODO Auto-generated method stub
		if (requestChainOfResponsability.getMontoRembolso() > 0 && requestChainOfResponsability.getMontoRembolso() <= 150) {
			requestChainOfResponsability
					.setResultadoRembolso("El rembolso fue aprobado por el Supervisor - Monto Aprobado: "
							+ requestChainOfResponsability.getMontoRembolso());
		} else {
			super.manjeadorSolicitudes(requestChainOfResponsability);
		}
	}

}
