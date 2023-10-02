/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.model;

import com.patrones.disenno.comportamiento.chainOfResponsability.request.RequestChainOfResponsability;

/**
 * 
 */
public class ManejadorDuenno extends ManejadorRembolsoBase{

	@Override
	public void manjeadorSolicitudes(RequestChainOfResponsability requestChainOfResponsability) {
		// TODO Auto-generated method stub
		if (requestChainOfResponsability.getMontoRembolso() >= 601 && requestChainOfResponsability.getMontoRembolso() <= 1000) {
			requestChainOfResponsability
					.setResultadoRembolso("El rembolso fue aprobado por el Dueño - Monto Aprobado: "
							+ requestChainOfResponsability.getMontoRembolso());
		} else {
			super.manjeadorSolicitudes(requestChainOfResponsability);
		}
	}


}
