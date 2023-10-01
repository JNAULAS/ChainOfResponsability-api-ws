/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.request;

/**
 * 
 */
public class RequestChainOfResponsability {
	private double montoRembolso;
	private String resultadoRemsolso;
	private boolean okRembolsoSupervisor;
	private boolean okRembolsoGerente;
	private boolean okRembolsoDueño;
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
	 * @return the resultadoRemsolso
	 */
	public String getResultadoRemsolso() {
		return resultadoRemsolso;
	}
	/**
	 * @param resultadoRemsolso the resultadoRemsolso to set
	 */
	public void setResultadoRemsolso(String resultadoRemsolso) {
		this.resultadoRemsolso = resultadoRemsolso;
	}
	/**
	 * @return the okRembolsoSupervisor
	 */
	public boolean isOkRembolsoSupervisor() {
		return okRembolsoSupervisor;
	}
	/**
	 * @param okRembolsoSupervisor the okRembolsoSupervisor to set
	 */
	public void setOkRembolsoSupervisor(boolean okRembolsoSupervisor) {
		this.okRembolsoSupervisor = okRembolsoSupervisor;
	}
	/**
	 * @return the okRembolsoGerente
	 */
	public boolean isOkRembolsoGerente() {
		return okRembolsoGerente;
	}
	/**
	 * @param okRembolsoGerente the okRembolsoGerente to set
	 */
	public void setOkRembolsoGerente(boolean okRembolsoGerente) {
		this.okRembolsoGerente = okRembolsoGerente;
	}
	/**
	 * @return the okRembolsoDueño
	 */
	public boolean isOkRembolsoDueño() {
		return okRembolsoDueño;
	}
	/**
	 * @param okRembolsoDueño the okRembolsoDueño to set
	 */
	public void setOkRembolsoDueño(boolean okRembolsoDueño) {
		this.okRembolsoDueño = okRembolsoDueño;
	}
	
	

}
