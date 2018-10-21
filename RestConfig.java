package webservices;

import java.util.HashSet;
import java.util.Set;

//import javax.ws.rs.core.Application;

//@javax.ws.rs.ApplicationPath("rest")
public class RestConfig extends javax.ws.rs.core.Application {

	public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(UserService.class);
        classes.add(TestService.class);
        return classes;
    }
}
