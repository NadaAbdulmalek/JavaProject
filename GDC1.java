package projectJava2;
import java.util.Scanner;
 // Nada
public class GDC1 {
    Scanner input = new Scanner (System.in);
    
    private String name;
    private final int maxSize = 500;
    private Customer1 [] arrayCustomers;
    private int numOfCustomer = 0; // counter

    
    // default cons
    public GDC1() {
    }
    
    // parameteriz cons
    public GDC1(String name) {
        this.name = name;
        arrayCustomers = new Customer1 [maxSize];  
    }
    
    
    // set/get method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    
     // Create, Modify and Delete Methods:
    
    // return true just if a customer added
     public boolean createCustomer(Customer1 C){
         if (numOfCustomer != 0){
             if (numOfCustomer < maxSize) {
                 arrayCustomers[numOfCustomer++] = C;
                 return true;
             }
         } return false;
     }
     
     
     public boolean modifyCustomer (int id){
         if (numOfCustomer != 0){
             for (int i = 0; i < numOfCustomer; i++){
                 if (arrayCustomers[i].getId() == id){
                     
                     if (arrayCustomers[i] instanceof Individual1){
                         System.out.println("Enter Phone Number:");
                     }
                     String phoneNumber = input.next();
                     
                     ((Individual1) arrayCustomers[i]).setPhoneNumber(phoneNumber);
                 }
                 else if
                         (arrayCustomers[i] instanceof Factory1){
                     int option = 0;
                     do {
                         System.out.println("What You Want:\n 1.Add a Product\n "
                                 +"2.Delete a Product\n " + "3.Modify a Product\n 4.Exit\n");
                         option = input.nextInt();
                         
                         switch (option){
                             case 1:
                                 System.out.println("Enter Product Name:");
                                 String name1 = input.next();
                                 System.out.println("Enter Product Price:");
                                 double price1 = input.nextDouble();
                                 System.out.println("Enter Special Price:");
                                 double specialPrice1 = input.nextDouble();
                                 
                                 System.out.println("Enter Date:\n Day/Month/Year");
                                 int day = input.nextInt();
                                 int month = input.nextInt();
                                 int year = input.nextInt();
                                 
                                 Date1 d1 = new Date1(day, month, year);
                                 
                                 Product1 p = new Product1 (name1, price1, specialPrice1 , d1);
                                 
                                 ((Factory1) arrayCustomers[i]).createProduct(p);
                                 break;
                             case 2: 
                                 System.out.println("Enter Product ID:");
                                 int id2 = input.nextInt();
                                 ((Factory1) arrayCustomers[i]).deleteProduct(id2);
                                 
                                 break;
                                 
                             case 3: 
                                 System.out.println("Enter Product ID:");
                                 int id3 = input.nextInt();
                                 System.out.println("Enter Product Name:");
                                 String name3 = input.next();
                                 System.out.println("Enter Product Price:");
                                 double price3 = input.nextDouble();
                                 System.out.println("Enter Special Price:");
                                 double specialPrice3 = input.nextDouble();
                                 
                                 System.out.println("Enter Date:\n Day/Month/Year");
                                 int day2 = input.nextInt();
                                 int month2 = input.nextInt();
                                 int year2 = input.nextInt();
                                 
                                 Date1 d2 = new Date1(day2, month2, year2);
                                 
                                 ((Factory1) arrayCustomers[i]).modifyProduct(id3,name3, price3,specialPrice3,d2); 
                                 break;
                                 
                             case 4: 
                                 System.out.println("Exit");
                                 break;
                             default:
                                  System.out.println("Wrong Choice!");
                                  break;
                         }
                     } while (option != 4);
                 }
             }return true;
         }
        return false;
       }

      
       // delete wiht shifting to left 
      public boolean deleteCustomer (int id){
          if (numOfCustomer != 0){
              for (int i = 0; i < numOfCustomer; i++){
            // find the index that containing id
             if ( arrayCustomers[i].getId() == id){
            // i = index .. Now start delete !
             for (int j = i; j < numOfCustomer -1 ; j++){
                 arrayCustomers[j] = arrayCustomers[j+1];
             }
             
             arrayCustomers[--numOfCustomer]= null;
             return true;
             }
              }
          } return false;
      }
      
      
      // others methods 
      public String getSpecific_Customer (int id){
          if (numOfCustomer != 0){
              for (int i = 0; i < numOfCustomer; i++){
                  if (arrayCustomers[i].getId() == id){
                      return arrayCustomers[i].toString();
                  }
              }
          } return null;
      }
            
      
      public String getAllIndividuals(){
          String str = "All Individuals:\n";
          if (numOfCustomer != 0){
              for (int i = 0; i < numOfCustomer; i++){
                  if (arrayCustomers[i] instanceof Individual1 ){
                      str+= arrayCustomers[i].toString() + "\n";
                  }
              }
          } return str;
      }
      
      
      public String getAllFactorys(){
          String str = "All Factorys:\n";
          if (numOfCustomer != 0){
              for (int i = 0; i < numOfCustomer; i++){
                  if (arrayCustomers[i] instanceof Factory1 ){
                      str+= arrayCustomers[i].toString() + "\n";
                  }
              }
          } return str;
      }
      
      
      
      public Customer1 [] getAllCustomer(){
          if ( numOfCustomer == 0 ){
              return null;
          }
          else{
              return arrayCustomers;
          }
      }
      
      
      
      // for GDCFrame 
      public void openFrame(){
          GDCFrame object = new GDCFrame(this);
          object.setVisible(true);
          return;
      }
      
      
      
      
      @Override
      public String toString(){
          String str = "";
            if (numOfCustomer != 0){
            for (int i= 0; i < numOfCustomer; i++){
               str+= arrayCustomers[i] + "\n";
            }
            return "GDC\n" + "Name:" + name + "Number Of Customers" + numOfCustomer 
                    + "The Customers Are:" + str;
        }
            else{ 
              return "";
        }
      }

}
