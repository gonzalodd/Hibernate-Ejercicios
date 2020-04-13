package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;
        
        //Recuperamos el objeto
        //1. transitivo
        contacto = em.find(Contacto.class, 3);
        
        //modificamos objeto
        contacto.setEmail("gduval@mail.com");
        em.getTransaction().begin();
        
        //2. persistente
        em.merge(contacto);
        em.getTransaction().commit();
        
        //3. detached
        System.out.println("Contacto " + contacto);
        
    }
}
