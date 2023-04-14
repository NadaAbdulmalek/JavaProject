package projectJava2;
// Nada
public abstract class Customer1 {
    
    protected int id; 
    public static int idCounter = 200;
    protected String name; 
    protected String address;                     

    // parameteriz cons
    public Customer1( String name, String address) {
        id = idCounter++;;
        this.name = name;
        this.address = address; 
    }

  
    public void setId(int id) {
        this.id = id;
    }

    
     public int getId() {
        return id;
    }

     
    public void setName(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }
     

    public void setAddress(String address) {
        this.address = address;
    }
    
     public String getAddress() {
        return address;
    }
    
     /*
      // Set method to all inst-varible for modify method in class GDC 
    public void setCustomer (int id, String name, String address){
        setId(id);
        setName(name); 
        setAddress(address);
    }
     */
    
    // print with toString method 
    @Override 
    public String toString(){
        return ("Informations Customer:\n" + 
                "Id:" + id + " Name:" + name + " Address:" + address ); 
    } 
}
