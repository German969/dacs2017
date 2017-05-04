package primerEntrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ROL")
public class Rol {
	
	@Id
	@Column(name = "id_rol")
	private int id;
	
	@Column
	private String nombrerol;
	
	@OneToMany(mappedBy = "rol")
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Rol() {
		
	}

	public Rol(int id, String nombrerol) {
		this.id = id;
		this.nombrerol = nombrerol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrerol() {
		return nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

}
