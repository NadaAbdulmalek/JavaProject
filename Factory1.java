package projectJava2;
// Nada
public class Factory1 extends Customer1 {
    
     private static final int maxSize = 500;
     private Product1 [] arrayProducts;
     private int numOfproducts = 0; // counter
     
    // default cons.. don't use super(), Customer class with just parameteriz cons! but super("","") right
    public Factory1() {
       this(null,null);
    }
    
    // parameteriz cons
    public Factory1 (String name, String address){
         super(name, address);
         arrayProducts = new Product1 [maxSize];
    }

    
    // Create, Modify And Delete Methods:
    
    // return true just if a product added
     public boolean createProduct(Product1 P){ 
         if (numOfproducts != 0){
        if (numOfproducts < maxSize) {
        arrayProducts[numOfproducts++] = P;
        return true;
        }
         } return false;
    }
     
    
     
     public boolean modifyProduct (int id, String name, double Price, double specialPrice, Date1 date){
         if (numOfproducts != 0){
             for (int i = 0; i < numOfproducts; i++){
                 if (arrayProducts[i].getId() == id){
                     arrayProducts[i].setProduct(name, Price, specialPrice, date);
                     return true;
                 }
             }
         }return false;
     }
     
    
     // delete wiht shifting to left 
     public boolean deleteProduct (int id){
         if (numOfproducts != 0){
             for (int i = 0; i < numOfproducts; i++){
            // find the index that containing id
            if ( arrayProducts[i].getId() == id){
            // i = index .. Now start delete
            for (int j = i; j < numOfproducts -1 ; j++){
                arrayProducts[j] = arrayProducts[j+1];
            }
            
            arrayProducts[--numOfproducts]= null;
            return true;
            }
             }
         }return false;
     }
        
     
     
     public Product1 getProduct(int id){
         // return product (obj)
         if (numOfproducts != 0){
             for (int i= 0; i < numOfproducts; i++){
                 if (arrayProducts[i].getId() == id){
                     return arrayProducts[i];
                 }
             }
         } return null;
     }


    // print with toString method 
    @Override
    public String toString(){
        String str = "";
        
        if (numOfproducts != 0){
            for (int i= 0; i < numOfproducts; i++){
              str+= arrayProducts[i];
            }
            return ("Informations Factory Customer:\n" + super.toString() + str);
        }
        return "There Are No Products!";
        }
        
}
/* 
ندى عبدالملك الخرجي 
ميرال محمد الربيعان
بنان فهد البريدي
*/