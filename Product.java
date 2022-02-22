/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class  Product {
  
    private String name ;
    public static double price;
    public static int ID;
    public static int counter=0;
    
    public Product (String name, int ID , double price){
        this.name=name;
   counter++;
        this.ID=counter;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCounter() {
        return counter;
    }
    

    @Override
    public String toString() {
        return "product{" + "name=" + name + ", price=" + price + ", ID=" + ID + '}';
    }

    

    }
 
    
    
  


