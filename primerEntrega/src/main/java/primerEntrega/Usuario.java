package primerEntrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private long id;
	
	@NotNull
	@Min(1)
	@Max(999999999999999L)
	@Column(name = "dni")
	private long dni;
	
	@NotNull
    @Min(1)
    @Max(999999999999999L)
	@Column(name  = "cuitCuil")
	private long cuitCuil;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "nombre")
	private String nombre;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "apellido")
	private String apellido;
	
	@NotNull
	@Column(name = "telefono")
	private String telefono;
	
	@NotNull
    @Size(min = 1, max = 100)
	@Column(name = "direccion")
	private String direccion;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "localidad")
	private String localidad;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "provincia")
	private String provincia;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "pais")
	private String pais;
	
	@NotNull
	@Column(name = "codigoPostal")
	private int coigoPostal;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "user")
	private String user;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "password")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "id_rol")
	private Rol rol;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public Usuario() {
		
	}

	public Usuario(long dni, long cuitCuil, String nombre, String apellido, String telefono,
			String direccion, String localidad, String provincia, String pais, int coigoPostal, String email,
			String user, String password, Rol rol) {
		this.dni = dni;
		this.cuitCuil = cuitCuil;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.coigoPostal = coigoPostal;
		this.email = email;
		this.user = user;
		this.password = password;
		this.rol = rol;
	}

	public long getIdusuario() {
		return id;
	}

	public void setIdusuario(int id) {
		this.id = id;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public long getCuitCuil() {
		return cuitCuil;
	}

	public void setCuitCuil(long cuitCuil) {
		this.cuitCuil = cuitCuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public int getCoigoPostal() {
		return coigoPostal;
	}

	public void setCoigoPostal(int coigoPostal) {
		this.coigoPostal = coigoPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
