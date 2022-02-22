/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Store {
   
    private String name;
    public static Product[]array=new Product[100];
    private static int numberOfProduct;
    public static int pcount=numberOfProduct;
   
    
    
    public Store(int numberOfProduct){
        array=new Product[numberOfProduct];
    
    }
    public Store(Product[]array){
        this.array=array;
        numberOfProduct=array.length;
    }
     public Product isExist(String name){
        
      for(int numberOfProduct=0; numberOfProduct<array.length;numberOfProduct++){
            if(array[numberOfProduct].getName().equals(name)){
                 return array[numberOfProduct];
            }
           
        }
        return null;
    }
     public void addProducts(Product product){

           if(numberOfProduct>array.length)
               System.out.println("this array is full");
           else
               array[numberOfProduct++]=product;
}
      public void remove(Product pr){
          
          for(int numberOfProduct=0;numberOfProduct<array.length;numberOfProduct++){
                       if(array[numberOfProduct]==pr){
                        for(int i=numberOfProduct;i<array.length-1;i++){
                        
                                  array[i]=array[i+1];
                        }
                       }
          }
      }
         
                 
             
          
          public double totalPrice(Product[]array, customer b){
              double total=0;
              for(int numberOfProduct=0;numberOfProduct<array.length;numberOfProduct++){
                          total+=Product.price;
              }
               
              
              if(b.countvisit>2)
                  total=total*25/100;
        return total;
          
      }
          public void buy(Product[]array,String name){
               Product b=isExist(name);
               double total=0;
               for(int numberOfProduct=0;numberOfProduct<array.length;numberOfProduct++ ){
                   if(b.getName().equals(name)){
                   }
               }
                System.out.println("this element isExist"+b);
               
               //for to total price
               for(int numberOfProduct=0;numberOfProduct<array.length;numberOfProduct++ ){
                       total+=Product.price;
               }
                       System.out.println("this total pric is="+total);
                // for to remove
                for(int numberOfProduct=0;numberOfProduct<array.length;numberOfProduct++){
                       if(array[numberOfProduct]==b){
                        for(int i=numberOfProduct;i<array.length-1;i++){
                                  array[i]=array[i+1];
                        }
                               }
                }
                  // for to print array
                 for(int numberOfProduct=0;numberOfProduct<array.length;numberOfProduct++){
                     System.out.println("this product from buy"+array[numberOfProduct]);
      
               }   
          }
          


     public String toString(){
         String s="";
        for(Product array: this.array)
            if(array !=null)
                s+="\n\t"+array+"\n\t";
        return s;
     
     }

}      

     
     

