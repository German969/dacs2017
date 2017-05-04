package primerEntrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MEDIOS_DE_PAGO")
public class MedioDePago {
	
	@Id
	@Column(name = "id_mediodepago")
	private int id;
	
	@Column
	private String descripcion;
	
	@OneToMany(mappedBy = "mediodepago")
	private List<Pedido> pedidosPagados = new ArrayList<Pedido>();

	public MedioDePago() {
		
	}

	public MedioDePago(int id, String descripcion) {
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
