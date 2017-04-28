package persistencia;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGOS_PEDIDO")
public class PagosPedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "idpedidos")
	private int idpedidos;
	
	@Column(name = "fechapago")
	private Date fechapago;
	
	public PagosPedido() {
		
	}

	public PagosPedido(int id, int idpedidos, Date fechapago, float monto) {
		this.id = id;
		this.idpedidos = idpedidos;
		this.fechapago = fechapago;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "PagosPedido [idpagos=" + id + ", idpedidos=" + idpedidos + ", fechapago=" + fechapago + ", monto="
				+ monto + "]";
	}

	@Column(name = "monto")
	private float monto;

	public int getIdpagos() {
		return id;
	}

	public void setIdpagos(int idpagos) {
		this.id = idpagos;
	}

	public int getIdpedidos() {
		return idpedidos;
	}

	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
	}

	public Date getFechapago() {
		return fechapago;
	}

	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

}
