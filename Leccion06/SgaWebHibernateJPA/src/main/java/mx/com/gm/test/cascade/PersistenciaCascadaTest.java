package mx.com.gm.test.cascade;

import javax.persistence.*;
import mx.com.gm.domain.Alumno;
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Domicilio;

public class PersistenciaCascadaTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Beazley");
        domicilio.setNoCalle("340");
        domicilio.setPais("Argentina");
        
        Contacto contacto =  new Contacto();
        contacto.setEmail("ddamian@mail.com");
        contacto.setTelefono("1559550062");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("David");
        alumno.setApellido("Damiam");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("Alumno = " + alumno);
    }
}
