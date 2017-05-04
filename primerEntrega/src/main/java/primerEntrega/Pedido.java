package primerEntrega;

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

import primerEntrega.Usuario;

@Entity
@Table(name = "PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fechapedido")
	private Date fechapedido;
	
	@Column(name = "estado")
	private String estado;
	
	@JoinColumn(name="usuario")
	@ManyToOne(fetch=FetchType.EAGER)
	private Usuario usuario;

	public Pedido() {
		
	}

	public Pedido(Date fechapedido, String estado, Usuario usuario) {
		super();
		this.fechapedido = fechapedido;
		this.estado = estado;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
