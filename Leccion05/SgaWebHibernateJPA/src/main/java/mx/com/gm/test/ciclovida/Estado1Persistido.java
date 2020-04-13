package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("1122334455");
        
        //2. persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        //3. detached (separado)
        System.out.println("Contacto: " + contacto);
        
    }
}
