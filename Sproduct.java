/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//import static Org.junit.Assert.*;
public class Sproduct extends Product {
    

    private String relationShip;
    private Product []products;
    
    public Sproduct(String name,int ID,double price,String relationShip,Product[]products){
        super(name,ID,price);
        this.relationShip=relationShip;
        this.products=products;
    }
    @Override
    public String toString() {
        String s="this spechial product";
        for(Product products: this.products)
            if(products !=null)
                s+="\n\t"+products+"\n\t";
        return s;
    }

}
