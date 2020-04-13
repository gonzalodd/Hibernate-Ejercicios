package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.AsignacionDAO;
import mx.com.gm.dao.ContactoDAO;
import mx.com.gm.dao.CursoDAO;
import mx.com.gm.dao.DomicilioDAO;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        System.out.println("Alumnos: ");
        imprimir(alumnoDAO.listar());
        
        System.out.println("Domicilios: ");
        DomicilioDAO domicilioDAO = new DomicilioDAO();
        imprimir(domicilioDAO.listar());
        
        System.out.println("Contactos :");
        ContactoDAO contactoDAO = new ContactoDAO();
        imprimir(contactoDAO.listar());
        
        System.out.println("Cursos :");
        CursoDAO cursoDAO = new CursoDAO();
        imprimir(cursoDAO.listar());
        
        System.out.println("Asignaciones :");
        AsignacionDAO asignacionDAO = new AsignacionDAO();
        imprimir(asignacionDAO.listar());
    }
    
    private static void imprimir(List coleccion){
        for(Object o : coleccion){
            System.out.println("valor = " + o);
        }
    }
}
