package primerEntrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_proveedor")
	private long id;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "nombre")
	private String nombre;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "pais")
	private String pais;
	
	@OneToMany(mappedBy = "proveedor")
	private List<Producto> productos = new ArrayList<Producto>();

	public Proveedor() {
		
	}

	public Proveedor(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
