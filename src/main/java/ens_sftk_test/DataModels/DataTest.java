package ens_sftk_test.DataModels;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataTest {
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private String sexo;
	private String estado;
	private String curp;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getDiaNacimiento() {
	    return new SimpleDateFormat("dd").format(fechaNacimiento);
	}
	public String getMesNacimiento() {
	    return new SimpleDateFormat("MM").format(fechaNacimiento);
	}
	public String getAnioNacimiento() {
	    return new SimpleDateFormat("yyyy").format(fechaNacimiento);
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		try {
			this.fechaNacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	@Override
	public String toString() {
		//return String.format("{ \"name\": \"%s\", \"path\": \"%s\" }", this.name, this.path);
		return new GsonBuilder().setDateFormat("dd-MM-yyyy").create().toJson(this);
	}
}
