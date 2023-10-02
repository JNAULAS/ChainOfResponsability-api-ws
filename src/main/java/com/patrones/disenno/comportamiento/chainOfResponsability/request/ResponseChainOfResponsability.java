/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability.request;

/**
 * 
 */
public class ResponseChainOfResponsability {
	private String montoRembolso;
	private String resultadoRembolso;
	private boolean okRembolsoSupervisor;
	private boolean okRembolsoGerente;
	private boolean okRembolsoDuenno;
	/**
	 * @return the montoRembolso
	 */
	public String getMontoRembolso() {
		return montoRembolso;
	}
	/**
	 * @param montoRembolso the montoRembolso to set
	 */
	public void setMontoRembolso(String montoRembolso) {
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
	 * @return the okRembolsoDuenno
	 */
	public boolean isOkRembolsoDuenno() {
		return okRembolsoDuenno;
	}
	/**
	 * @param okRembolsoDuenno the okRembolsoDuenno to set
	 */
	public void setOkRembolsoDuenno(boolean okRembolsoDuenno) {
		this.okRembolsoDuenno = okRembolsoDuenno;
	}
	

}
