/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.model;

/**
 * 
 */
public class ManejadorRembolsoBase implements ManejadorRembolso{
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

	@Override
	public String visualizarEstado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String manjeadorSolicitudes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String respuestaManejador() {
		return "";
	}
	public boolean siguienteManejador() {
		return true;
	}


}
