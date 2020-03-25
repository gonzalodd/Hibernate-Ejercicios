package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class ServicioPersonas {
    
    private PersonaDAO personaDAO;
    
    public ServicioPersonas(){
        this.personaDAO = new PersonaDAO();
    }
    
    public List<Persona> listarPersonas(){
        return this.personaDAO.listar();
    }
}
