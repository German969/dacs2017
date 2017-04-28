package persistencia;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteServlet", urlPatterns = { "/prueba" })
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Injected DAO EJB:
	@EJB
	ClienteDAO clienteDao;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Handle a new guest:
        String valor = request.getParameter("valor");
        String donde = request.getParameter("donde");
        String accion = request.getParameter("accion");
        if (valor != null){
        	if (accion.equals("agregar")){
        		if (donde.equals("cliente")){
        			clienteDao.persist(new Cliente("12345678",valor));
        		};
            }
        };
 
        // Display the list of guests:
        doGet(request, response);
    }

}