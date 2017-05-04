package primerEntrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
	
	@Id
	@Column(name = "id_proveedor")
	private long id;
	
	@Column
	private String nombre;
	
	@Column
	private String pais;
	
	@OneToMany(mappedBy = "proveedor")
	private List<Producto> productos = new ArrayList<Producto>();

	public Proveedor() {
		
	}

	public Proveedor(long id, String nombre, String pais) {
		this.id = id;
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
