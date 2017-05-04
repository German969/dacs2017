package primerEntrega;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//formas de pago
@Entity
@Table(name = "FORMAS_DE_PAGO")
public class Pago {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String descripcion;

	public Pago() {
		
	}

	public Pago(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
