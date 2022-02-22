/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Manager extends Employee{
 private Store  m1 ;
    public Manager(String name, int ID, double salary){
    
    
    super(name,ID,salary);
    this.m1=m1;
}

    public void remove(int ID){
          for(int i=0; i<m1.array.length; i++){
                       if(m1.array[i].equals(ID)){
                        for(int j=i;j<m1.array.length-1;j++){
                        
                                  m1.array[j]=m1.array[j+1];
                        }
                       }
    
          }
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
