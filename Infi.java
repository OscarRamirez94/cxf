package com.estafeta.traductor.modelo.registrosdeintercambio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = "\\|" )
public class Infi implements RegistroDeIntercambio {
	private String idMensaje;
	private String sessionFileName;
	private SimpleDateFormat simpleDateFormat;
	@DataField(pos = 1)
	private String numeroRegistro;
	@DataField(pos = 2)
	private String numeroVehiculo;
	@DataField(pos = 3)
	private String numeroOperador;
	@DataField(pos = 4)
	private String siglasPlaza;
	@DataField(pos = 5)
	private String fechaIni;
	@DataField(pos = 6)
	private String fechaFin;
	@DataField(pos = 7)
	private String rutaLocal;
	@DataField(pos = 8)
	private String numEmpAyudande;
	@DataField(pos = 9)
	private String claveEx;
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
	public String getNumeroVehiculo() {
		return numeroVehiculo;
	}
	public String getNumeroOperador() {
		return numeroOperador;
	}
	public String getSiglasPlaza() {
		return siglasPlaza;
	}
	public String getFechaIni() {
		return fechaIni;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public String getRutaLocal() {
		return rutaLocal;
	}
	public String getNumEmpAyudande() {
		return numEmpAyudande;
	}
	public String getClaveEx() {
		return claveEx;
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
	public void setNumeroVehiculo(String numeroVehiculo) {
		this.numeroVehiculo = numeroVehiculo;
	}
	public void setNumeroOperador(String numeroOperador) {
		this.numeroOperador = numeroOperador;
	}
	public void setSiglasPlaza(String siglasPlaza) {
		this.siglasPlaza = siglasPlaza;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public void setRutaLocal(String rutaLocal) {
		this.rutaLocal = rutaLocal;
	}
	public void setNumEmpAyudande(String numEmpAyudande) {
		this.numEmpAyudande = numEmpAyudande;
	}
	public void setClaveEx(String claveEx) {
		this.claveEx = claveEx;
	}
	
	
	
}
