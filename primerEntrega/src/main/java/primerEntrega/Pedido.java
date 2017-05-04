package primerEntrega;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class Pedido {
	
	@Id
	@Column(name = "id_pedido")
	private long id;
	
	@Column
	private Date fecha;
	
	@Column
	private String estado;
	
	@Column
	private Double total;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario cliente;
	
	@ManyToMany
	@JoinTable(name = "LINEA_PEDIDO", joinColumns = @JoinColumn(name = "id_pedido"), inverseJoinColumns = @JoinColumn(name = "id_producto"))
	private List<Producto> productos = new ArrayList<Producto>();
	
	@OneToOne
	@JoinColumn(name = "id_mediodepago")
	private MedioDePago mediodepago;

	public Pedido() {
		
	}

	public Pedido(long id, Date fecha, String estado, Double total, Usuario cliente) {
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.total = total;
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Usuario getCliente() {
		return cliente;
	}
	
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public MedioDePago getMediodepago() {
		return mediodepago;
	}
	
	public void setMediodepago(MedioDePago mediodepago) {
		this.mediodepago = mediodepago;
	}

}
