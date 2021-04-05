package com.ifxnetworks.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;


@Entity
@Table(name = "Persona")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nombres;
	private String apellidos;
	private String usuario;
	private String contrasenna;
	private String direccion;
	private int telefono;
	private int edad;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	@Column(name="nombres", nullable=false)
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	

	@Column(name="apellidos", nullable=false)
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	@Column(name="usuario", nullable=false)
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	@Column(name="contrasenna", nullable=false)
	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}


	@Column(name="direccion", nullable=false)
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Column(name="telefono", nullable=false)
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

	@Column(name="edad", nullable=false)
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}




	public Persona(String nombres, String apellidos, String usuario, String contrasenna, String direccion, int telefono, int edad, Date fechaNacimiento) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.contrasenna = contrasenna;
		this.direccion = direccion;
		this.telefono = telefono;
		this.edad = edad;
	}


	public Persona() {
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", usuario=" + usuario
				+ ", contrasenna=" + contrasenna + ", direccion=" + direccion + ", telefono=" + telefono + ", edad="
				+ edad + "]";
	}

}
