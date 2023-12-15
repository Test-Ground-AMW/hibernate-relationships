package lk.ijse.dep11.relationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HelloJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dep11");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            System.out.println(em);
            em.getTransaction().commit();
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        } finally {
            em.close();
            emf.close();
        }
    }
}
