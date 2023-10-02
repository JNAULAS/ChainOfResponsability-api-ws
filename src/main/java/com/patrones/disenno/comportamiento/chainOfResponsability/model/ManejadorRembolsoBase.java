/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.model;

import com.patrones.disenno.comportamiento.chainOfResponsability.request.RequestChainOfResponsability;

/**
 * 
 */
public class ManejadorRembolsoBase implements ManejadorRembolso{
	
	private ManejadorRembolso siguienteManejadorRembolso;
	private double monto;
	
	
	
	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}



	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}



	/**
	 * @param siguienteManejadorRembolso the siguienteManejadorRembolso to set
	 */
	public void setSiguienteManejadorRembolso(ManejadorRembolso siguienteManejadorRembolso) {
		this.siguienteManejadorRembolso = siguienteManejadorRembolso;
	}



	@Override
	public void manjeadorSolicitudes(RequestChainOfResponsability requestChainOfResponsability) {
		// TODO Auto-generated method stub
		String valorRetorno = null;
		if(siguienteManejadorRembolso != null ) {
			siguienteManejadorRembolso.manjeadorSolicitudes(requestChainOfResponsability);
		}else {
			requestChainOfResponsability.setResultadoRembolso("La solicitud de rembolso no pudo ser autorizada.");
		}
	}


	


}
