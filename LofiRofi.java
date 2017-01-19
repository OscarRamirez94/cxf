package com.estafeta.traductor.modelo.registrosdeintercambio;
import java.text.SimpleDateFormat;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = "\\|" )
public class LofiRofi implements RegistroDeIntercambio {
	private String idMensaje;
	private String sessionFileName;
	private SimpleDateFormat simpleDateFormat;
	@DataField(pos = 1)
	private String numeroRegistro;
	@DataField(pos = 2)
	private String lR;
	@DataField(pos = 3)
	private String siglasPlaza;
	@DataField(pos = 4)
	private String numeroOficina;
	@DataField(pos = 5)
	private String fechaEvento;
	@DataField(pos = 6)
	private String rutaLocal;
	@DataField(pos = 7)
	private String numeroEmpleado;
	@DataField(pos = 8)
	private String numeroVehiculo;
	public String getIdMensaje() {
		return idMensaje;
	}
	public String getSessionFileName() {
		return sessionFileName;
	}
	public SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public String getlR() {
		return lR;
	}
	public String getSiglasPlaza() {
		return siglasPlaza;
	}
	public String getNumeroOficina() {
		return numeroOficina;
	}
	public String getFechaEvento() {
		return fechaEvento;
	}
	public String getRutaLocal() {
		return rutaLocal;
	}
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public String getNumeroVehiculo() {
		return numeroVehiculo;
	}
	public void setIdMensaje(String idMensaje) {
		this.idMensaje = idMensaje;
	}
	public void setSessionFileName(String sessionFileName) {
		this.sessionFileName = sessionFileName;
	}
	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public void setlR(String lR) {
		this.lR = lR;
	}
	public void setSiglasPlaza(String siglasPlaza) {
		this.siglasPlaza = siglasPlaza;
	}
	public void setNumeroOficina(String numeroOficina) {
		this.numeroOficina = numeroOficina;
	}
	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public void setRutaLocal(String rutaLocal) {
		this.rutaLocal = rutaLocal;
	}
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public void setNumeroVehiculo(String numeroVehiculo) {
		this.numeroVehiculo = numeroVehiculo;
	}
	
}
