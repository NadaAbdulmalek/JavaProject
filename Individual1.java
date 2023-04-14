package projectJava2;
 // Nada
public class Individual1 extends Customer1 {
    private String phoneNumber; 
    
    
    // default cons.. don't use super(), Customer class with just parameteriz cons! but super("","") right
    public Individual1() {
       this(null,null,null);
    }
    
    // parameteriz constructor
    public Individual1( String name, String address, String phoneNumber) {
        super(name, address);
        this.phoneNumber = phoneNumber;
    }
   
    
     // set/get methods
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
        
    // print with toString method 
    public String toString(){
        return("Informations Individual Customer:\n" + 
                      super.toString() + " phone Number: " + phoneNumber );
    }
}
