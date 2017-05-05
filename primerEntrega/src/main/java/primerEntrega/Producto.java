package primerEntrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "comision")
	private double comision;
	
	@Column(name = "stock")
	private int stock;
	
	@OneToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@OneToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedor proveedor;
	
	@ManyToMany(mappedBy = "productos")
	private List<Pedido> pedidos  = new ArrayList<Pedido>();

	public Producto() {
		
	}

	public Producto(String nombre, String marca, String descripcion, double precio, double comision, int stock,
			Categoria categoria, Proveedor proveedor) {
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.comision = comision;
		this.stock = stock;
		this.categoria = categoria;
		this.proveedor = proveedor;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getComision() {
		return comision;
	}
	
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", comision=" + comision + ", stock=" + stock + ", categoria=" + categoria
				+ ", proveedor=" + proveedor + "]";
	}
	

}
