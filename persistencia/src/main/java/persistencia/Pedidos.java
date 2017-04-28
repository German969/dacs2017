package persistencia;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import persistencia.Cliente;

@Entity
@Table(name = "PEDIDOS")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fechapedido")
	private Date fechapedido;
	
	@Column(name = "estado")
	private String estado;
	
	@JoinColumn(name="id_cliente")
	@ManyToOne(fetch=FetchType.EAGER)
	private Cliente cliente;
	
	@Override
	public String toString() {
		return "Pedidos [idpedidos=" + id + ", fechapedido=" + fechapedido + ", estado=" + estado
				+ ", idclientes=" + id + "]";
	}

	public Pedidos(int idpedidos, Date fechapedido, String estado, int idclientes) {
		this.id = idpedidos;
		this.fechapedido = fechapedido;
		this.estado = estado;
		this.id = idclientes;
	}

	public Pedidos() {
		
	}

	public int getIdpedidos() {
		return id;
	}

	public void setIdpedidos(int idpedidos) {
		this.id = idpedidos;
	}

	public Date getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(Date fechapedido) {
		this.fechapedido = fechapedido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdclientes() {
		return id;
	}

	public void setIdclientes(int idclientes) {
		this.id = idclientes;
	}

}
