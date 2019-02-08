package ws;

import classes.User;
import ws.DemoWebServiceInterface;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@WebService(endpointInterface = "ws.DemoWebServiceInterface")
public class WSService implements DemoWebServiceInterface {

//Entity manager
    EntityManagerFactory emf = Persistence.createEntityManagerFactory ("DemoWebService");
    EntityManager em = emf.createEntityManager ();
    EntityTransaction tx = em.getTransaction ();

    @Override
    public User addUser(int userId, String firstName, String lastName)
    {

        User user1 = new User();
        user1.setUserID (userId);
        user1.setFirstName (firstName);
        user1.setLastName (lastName);

        tx.begin ();
        em.persist (user1);
        tx.commit ();

        return user1;
    }

}
