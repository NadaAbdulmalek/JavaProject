package projectJava2;
// Nada 
public class Product1 {
    
    private int id;
    public static int productCounter = 200;
    private String name;
    private double Price;
    private double specialPrice;
    private Date1 dateOfavailability; // composition
    
    
    // parameteriz cons
    public Product1( String name, double Price, double specialPrice , Date1 dateOfavailability) {
        id = productCounter++;
        this.name = name;
        this.Price = Price;
        this.specialPrice = specialPrice;
        this.dateOfavailability = dateOfavailability;
    }
    
    // set/get methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Date1 getDateOfavailability() {
        return dateOfavailability;
    }

    public void setDateOfavailability(Date1 dateOfavailability) {
        this.dateOfavailability = dateOfavailability;
    }
    
    
    // Set for all inst-varible method for method modify in class Factory 
    public void setProduct (String name, double Price, double specialPrice, Date1 date){
      setName(name); 
      setPrice(Price);
      setSpecialPrice(specialPrice);
      setDateOfavailability(date);  
    }

    
    @Override 
    public String toString(){
        return "Information Product:\n" + "ID: " + id + " Name: " + name + " Price: " + Price 
                + " Special Price: " + specialPrice + " Date: " + dateOfavailability;
          
    }
    
    
}
