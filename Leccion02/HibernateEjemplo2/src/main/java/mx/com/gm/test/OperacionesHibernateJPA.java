package mx.com.gm.test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

//      ******** LISTAR ********        
       
//      personaDAO.listar();
        
        /*
        ******** INSERTAR ********
        Persona persona = new Persona();
        persona.setIdPersona(4);
        persona.setNombre("Damian");
        persona.setApellido("Esparza");
        persona.setEmail("desparza@mail.com");
        persona.setTelefono("1234567897");
        
        personaDAO.insertar(persona);
        */
        
//      ******** MODIFICAR ********
        
//      personaDAO.listar();
//        
//      Persona persona = new Persona();
//      persona.setIdPersona(4);
//      persona = personaDAO.buscarPersonaPorId(persona);
//      System.out.println("Persona encontrada: " + persona);
//        
//      persona.setApellido("Esparza");
//      persona.setEmail("desparza@mail.com");
//        
//      personaDAO.modificar(persona);
//      personaDAO.listar();   

//      ******** ELIMINAR ********
        Persona persona = new Persona();
        persona.setIdPersona(4);
        persona = personaDAO.buscarPersonaPorId(persona);
        System.out.println("Persona encontrada: " + persona);
        
        personaDAO.eliminar(persona);
        personaDAO.listar();
    }
}
