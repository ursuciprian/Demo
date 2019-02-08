package ws;

import classes.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@WebService(name = "DemoWebService")
public interface DemoWebServiceInterface {




    @WebMethod(operationName = "addUser")
    User addUser(@WebParam(name = "userid") int userId, @WebParam(name="fistName") String firstName, @WebParam(name="lastName") String lastName);

}
