package primerEntrega;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private long id;
	
	@NotNull
	@Column(name = "fecha")
	private Date fecha;
	
	@NotNull
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario cliente;
	
	@ManyToMany
	@JoinTable(name = "LINEA_PEDIDO", joinColumns = @JoinColumn(name = "id_pedido"), inverseJoinColumns = @JoinColumn(name = "id_producto"))
	private List<Producto> productos = new ArrayList<Producto>();
	
	@Column(name = "fechaPago")
	private Date fechaPago;
	
	@OneToOne
	@JoinColumn(name = "id_mediodepago")
	private MedioDePago mediodepago;

	public Pedido() {
		
	}

	public Pedido(Date fecha, String estado, Double total, Usuario cliente) {
		this.fecha = fecha;
		this.estado = estado;
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
