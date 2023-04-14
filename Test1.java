package projectJava2;
import java.util.Scanner;
// Nada
public class Test1 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        
        int num = 0;
        
        do{
            System.out.println("Choose and Enter a Number that Represents What You Want:\n" +
             "1. Add a new Customer\n" + "2. delete a Customer\n" +
                       "3. Modify a Customer's information\n" +
                       "4. Print the Customer information\n" + "5. Exit\n"  + "6.Open Frame");
            num = input.nextInt();
            
            switch (num) {
            // Add
                case 1:
                    System.out.println("1.Individual Customer\n" +"2.Factory Customer\n");
                    int n1 = input.nextInt();

                    System.out.println("Enter Customer Name:");
                    String name = input.next();
                    System.out.println("Enter Customer Address:");
                    String address = input.next();
                    
                    switch (n1){ 
                        case 1:
                            System.out.println("Enter Phone Number:");
                            String phoneNumber1 = input.next();
                            
                            GDC1 c1 = new GDC1();
                            Individual1 individual = new Individual1(name, address, phoneNumber1);
                            c1.createCustomer(individual);
                            break;
                            
                        case 2 :
                            GDC1 c2 = new GDC1();
                            Factory1 factory = new Factory1 (name, address);
                            c2.createCustomer(factory);
                            break;
                        default:
                            System.out.println("Wrong choice!");
                            break;
                    }
                    break;
            // Delete
                case 2:
                    System.out.println("Enter Customer ID:");
                    int id = input.nextInt();
                    GDC1 de = new GDC1();
                    de.deleteCustomer(id);
                    break;
            // Modify  
                case 3:
                
                    int n3 = 0;
                    do {
                        System.out.println("1.Individual Customer \n 2.Factory Customer\n 3.Exit\n");
                        n3 = input.nextInt();
                        
                        switch (n3){
                            case 1:
                            case 2:
                                System.out.println("Enter Customer ID:");
                                int Id3 = input.nextInt();
                                
                                GDC1 Mod = new GDC1();
                                Mod.modifyCustomer(Id3);
                                break;
                            
                            case 3:
                                System.out.println("Exit");
                                break;
                                
                            default:
                                System.out.println("Wrong choice!");
                                break;
                        }
                    } while (n3 != 3);
                    
                    break;
                
            // Print    
                case 4:
                    int numPrint = 0;
                     GDC1 c1 = new GDC1();
                     
                    do {
                        System.out.println("1.A specific customer\n"
                                        + "2.All individual customers\n" 
                                        + "3.All Factory customers\n" 
                                        + "4.All customers\n" + "5.Exit\n");
                        
                        numPrint = input.nextInt();
                       
                        
                        switch (numPrint){
                            case 1:
                                System.out.println("Enter ID:");
                                int id4 = input.nextInt();

                               System.out.println(c1.getSpecific_Customer(id4));
                                break;
                            
                            case 2:
                               System.out.println(c1.getAllIndividuals());
                                break;
                            
                            case 3:
                               System.out.println(c1.getAllFactorys());
                                break;
                            
                            case 4:
                                System.out.println(c1.getAllCustomer());
                                break;
                            
                            case 5:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("Wrong choice!");
                                break;
                        }
                    }while (numPrint != 5);
                    break;
 
                 // Exit
                case 5:
                    System.out.println("Good bye !");
                    break;
                
                default:
                    System.out.println("Wrong choice!");
                    break;
                    
               // Open Frame 
                case 6: 
                    GDC1 GDCFrame = new GDC1();
                    GDCFrame.openFrame(); 
                    break;
            }
            
        }while(num != 5);
    }
}




/* 
ندى عبدالملك الخرجي 
ميرال محمد الربيعان
بنان فهد البريدي
*/