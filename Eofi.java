package com.estafeta.traductor.modelo.registrosdeintercambio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = "\\|" )
public class Eofi implements RegistroDeIntercambio {
	
	private String idMensaje;
	private String sessionFileName;
	private SimpleDateFormat simpleDateFormat;
	
	@DataField(pos = 1)
	private String numeroRegistro;
	@DataField(pos = 2)
	private String numeroGuia;
	@DataField(pos = 3)
	private String numeroOficina;
	@DataField(pos = 4)
	private String fechaEvento;
	@DataField(pos = 5)
	private String rutaLocal;
	@DataField(pos = 6, required = false)
	private String cveEx;
	@DataField(pos = 7)
	private String numeroEmpleado;
	@DataField(pos = 8)
	private String numeroVehiculo;
	@DataField(pos = 9)
	private String idParada;
	public String getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(String idMensaje) {
		this.idMensaje = idMensaje;
	}
	public String getSessionFileName() {
		return sessionFileName;
	}
	public void setSessionFileName(String sessionFileName) {
		this.sessionFileName = sessionFileName;
	}
	public SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}
	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getNumeroGuia() {
		return numeroGuia;
	}
	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}
	public String getNumeroOficina() {
		return numeroOficina;
	}
	public void setNumeroOficina(String numeroOficina) {
		this.numeroOficina = numeroOficina;
	}
	public String getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getRutaLocal() {
		return rutaLocal;
	}
	public void setRutaLocal(String rutaLocal) {
		this.rutaLocal = rutaLocal;
	}
	public String getCveEx() {
		return cveEx;
	}
	public void setCveEx(String cveEx) {
		this.cveEx = cveEx;
	}
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getNumeroVehiculo() {
		return numeroVehiculo;
	}
	public void setNumeroVehiculo(String numeroVehiculo) {
		this.numeroVehiculo = numeroVehiculo;
	}
	public String getIdParada() {
		return idParada;
	}
	public void setIdParada(String idParada) {
		this.idParada = idParada;
	}
	
	
	
}
