/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class customer extends user{
    
    public static int countvisit=0;
    
    public customer(String name, int ID){
        super(name,ID);
        countvisit++;
    }
    public void Newcoustmore(){
        if(countvisit==1||countvisit==2)
            System.out.println("this new customer");
    }
    public void Spcustomer(){
        countvisit++;
        if(countvisit>2)
            System.out.println("this spechial customer");
    }
     
}
