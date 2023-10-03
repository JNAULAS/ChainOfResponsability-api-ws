/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.request;

/**
 * 
 */
public class RequestChainOfResponsability {
	private double montoRembolso;
	private String resultadoRembolso;
//	private boolean okRembolsoSupervisor;
//	private boolean okRembolsoGerente;
//	private boolean okRembolsoDuenno;
	/**
	 * @return the montoRembolso
	 */
	public double getMontoRembolso() {
		return montoRembolso;
	}
	/**
	 * @param montoRembolso the montoRembolso to set
	 */
	public void setMontoRembolso(double montoRembolso) {
		this.montoRembolso = montoRembolso;
	}
	/**
	 * @return the resultadoRembolso
	 */
	public String getResultadoRembolso() {
		return resultadoRembolso;
	}
	/**
	 * @param resultadoRembolso the resultadoRembolso to set
	 */
	public void setResultadoRembolso(String resultadoRembolso) {
		this.resultadoRembolso = resultadoRembolso;
	}
	

}
