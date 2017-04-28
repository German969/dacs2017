package persistencia;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import persistencia.Pedidos;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre")
	private String nombre;
	
//	@Column(name = "telefono",nullable=true)
//	private String telefono;
//	
//	@Column(name = "localidad",nullable=true)
//	private String localidad;
//	
//	@Column(name = "provincia",nullable=true)
//	private String provincia;
//	
//	@Column(name = "pais",nullable=true)
//	private String pais;
//	
//	@Column(name = "codigopostal",nullable=true)
//	private String codigopostal;
//	
//	@Column(name = "email",nullable=true)
//	private String email;
//	
//	@Column(name = "usuario",nullable=true)
//	private String usuario;
//	
//	@Column(name = "password",nullable=true)
//	private String password;
//	
//	@OneToMany(mappedBy="cliente", fetch=FetchType.LAZY)
//	private Set<Pedidos> pedidos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public String getTelefono() {
//		return telefono;
//	}
//
//	public void setTelefono(String telefono) {
//		this.telefono = telefono;
//	}
//
//	public String getLocalidad() {
//		return localidad;
//	}
//
//	public void setLocalidad(String localidad) {
//		this.localidad = localidad;
//	}
//
//	public String getProvincia() {
//		return provincia;
//	}
//
//	public void setProvincia(String provincia) {
//		this.provincia = provincia;
//	}
//
//	public String getPais() {
//		return pais;
//	}
//
//	public void setPais(String pais) {
//		this.pais = pais;
//	}
//
//	public String getCodigopostal() {
//		return codigopostal;
//	}
//
//	public void setCodigopostal(String codigopostal) {
//		this.codigopostal = codigopostal;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(String usuario) {
//		this.usuario = usuario;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public Cliente() {
		
	}

	public Cliente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + "]";
	}
	
}
