/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.model;

import com.patrones.disenno.comportamiento.chainOfResponsability.request.RequestChainOfResponsability;

/**
 * 
 */
public class ManejadorGerente extends ManejadorRembolsoBase {

	@Override
	public void manjeadorSolicitudes(RequestChainOfResponsability requestChainOfResponsability) {
		// TODO Auto-generated method stub
		if (requestChainOfResponsability.getMontoRembolso() > 151 && requestChainOfResponsability.getMontoRembolso() <= 600) {
			requestChainOfResponsability
					.setResultadoRembolso("El rembolso fue aprobado por el Gerente - Monto Aprobado: "
							+ requestChainOfResponsability.getMontoRembolso());
		} else {
			super.manjeadorSolicitudes(requestChainOfResponsability);
		}
	}

}
