

package portal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author Donald
 */

@ManagedBean
@SessionScoped

public class Data {
    
    private Student s;
    private HibernateUtil helper;
    private Session session;
    
    public void addStudent(){
        s = new Student("Donald");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
    }
    
}
