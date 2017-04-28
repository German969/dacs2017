package persistencia;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpedidos")
	private int idpedidos;
	
	@Column(name = "fechapedido")
	private Date fechapedido;
	
	@Column(name = "estado")
	private String estado;
	
	@Override
	public String toString() {
		return "Pedidos [idpedidos=" + idpedidos + ", fechapedido=" + fechapedido + ", estado=" + estado
				+ ", idclientes=" + idclientes + "]";
	}

	public Pedidos(int idpedidos, Date fechapedido, String estado, int idclientes) {
		this.idpedidos = idpedidos;
		this.fechapedido = fechapedido;
		this.estado = estado;
		this.idclientes = idclientes;
	}

	public Pedidos() {
		
	}

	@Column(name = "iclientes")
	private int idclientes;

	public int getIdpedidos() {
		return idpedidos;
	}

	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
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
		return idclientes;
	}

	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

}
