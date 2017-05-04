package primerEntrega;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import primerEntrega.Pedido;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "dni")
	private String dni;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "localidad")
	private String localidad;

	@Column(name = "provincia")
	private String provincia;

	@Column(name = "pais")
	private String pais;

	@Column(name = "codigopostal")
	private String codigopostal;

	@Column(name = "email")
	private String email;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "password")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "id_rol")
	private Rol rol;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private Set<Pedido> pedidos;

	public Usuario() {

	}

	public Usuario(String dni, String nombre, String telefono, String localidad, String provincia, String pais,
			String codigopostal, String email, String usuario, String password, Set<Pedido> pedidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigopostal = codigopostal;
		this.email = email;
		this.usuario = usuario;
		this.password = password;
		this.pedidos = pedidos;
	}

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}