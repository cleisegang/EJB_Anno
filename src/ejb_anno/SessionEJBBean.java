package ejb_anno;

import javax.annotation.Resource;

import javax.ejb.Local;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless(name = "SessionEJB", mappedName = "WebService-EJB_Anno-SessionEJB")
@Local
@WebService
public class SessionEJBBean {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
  
@WebMethod    
    public String sayHello (String s) { 
             return "Hello " + s + " this is your SessionBean..";
        }
}
