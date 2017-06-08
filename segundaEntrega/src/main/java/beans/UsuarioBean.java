package beans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UsuarioDao;
import entities.Usuario;

@ManagedBean(name = "usuarioBean", eager = true)
@SessionScoped
public class UsuarioBean {
	
	int id;

	String name;
	
	Usuario usuario;

	@EJB
	UsuarioDao dao;
	
	public List<Usuario> usuarios;

	public String create() {
		
		this.saveUsuarios();

		Usuario u = new Usuario(name);

		dao.create(u);
		
		this.getAll();
		
		return "usuarios.xhtml";

	}
	
	public String getAll() {

		usuarios = dao.getUsuarios();
		
		return "usuarios.xhtml";

	}
	
	public List<Usuario> getAllUsers() {

		usuarios = dao.getUsuarios();
		
		return usuarios;

	}
	
	public String getByName() {

		usuarios = dao.getByName(name);
		
		return "usuarios.xhtml";

	}
	
	public String editUsuario(Usuario usuario) {
		  name = usuario.getNombre();
	      usuario.setCanEdit(true);
	      return null;
	   }
	
	public String notEditUsuario(Usuario usuario) {
	      usuario.setCanEdit(false);
	      usuario.setNombre(name);
	      return null;
	   }
	
	public String saveUsuarios() {
	      
	      //set "canEdit" of all employees to false 
	      
	      for (Usuario usuario : usuarios) {
	    	  if(usuario.isCanEdit()){
	    		  this.update();
	    	  };
	         usuario.setCanEdit(false);
	      }
	      
	      
	      
	      return null;
	   }
	
	public void update() {
		
		dao.update(usuario);

	}
	
	public void deleteUsuario(){
		dao.delete(usuario);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
