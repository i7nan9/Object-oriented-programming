/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Employee extends user {
    
    private double salary;
    public Employee(String name, int ID, double salary){
        super(name,ID);
        this.salary=salary;
    } 

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double updateSalary(double salary,double bouns){
        
        double total =salary*bouns/100;
        
        return total;
        
        
    }

    @Override
    public String toString() {
        return super.getName()+":"+super.getID()+"and ="+salary;
    }

}
