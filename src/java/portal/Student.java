
package portal;

/**
 *
 * @author Donald
 */
public class Student {
    
    private int id;
    private String fullname;
    
    
    Student(String fullname){
        this.fullname = fullname;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

   
    
}
