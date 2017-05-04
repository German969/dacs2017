package primerEntrega;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PROVEEDOR")
public class Proveedor {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String pais;

	public Proveedor() {
		
	}

	public Proveedor(int id, String nombre, String pais) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

}
