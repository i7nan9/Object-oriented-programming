/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Project {
    public static void main(String[]args){
 // TODO code application logic here
        Scanner input=new Scanner(System.in);
        customer c =new customer("haddel",1243);
        customer d=new customer("haddels",1235);
        Employee e=new Employee("wafaa",1546,65000);
        Employee s=new Employee("hanan",1326,65000);
        Product p=new Product("phone",1245,3000);
        Product h=new Product("watch",1247,1000);
        Product j=new Product("table",1248,60);
        Product k=new Product("smart",1245,500);
        Product l=new Product("cover",1245,80);
      Product  u=new Product("laptop",1102,2000);
        Product t=new Product("ipad",1003,2500);
       
        Store m=new Store(100);
       Product []products=new Product[5];
        products[0]=p;
        products[1]=h;
        products[2]=j;
        products[3]=k;
        Sproduct st=new Sproduct("haddel",1004,1000.0,"special",products);
        Product[]productts=new Product[2];
        productts[0]=u;
        productts[1]=t;
        Sproduct sl=new Sproduct("hadeel",1002,3000.0,"technolgi",productts);
        
        System.out.println("welcom in happy stor\nit contains product("+p.getCounter()+")\n"+p+"\n"+h+"\n"+j+"\n"+k+"\n"+l);
        System.out.println("update salary="+e.updateSalary(65000,10));
        System.out.println("udate salary="+s.updateSalary(65000, 10));
        
        m.addProducts(p);
        System.out.println("befor add product"+m.toString());
        m.addProducts(h);
        m.addProducts(j);
        m.addProducts(k);
        m.addProducts(l);
        m.addProducts(t);
        System.out.println("after add product"+m.toString());
        System.out.println("the list of the first special product"+st.toString());
        System.out.println("the second list of special products"+sl.toString());
        m.remove(h);
        System.out.println("the after remove the product from stor"+m.toString());
        m.buy(products, "phone");
        System.out.println(m.toString());
        m.buy(products, "phone");
       
        
        m.buy(products, "maskra");
        
         System.out.println("1.Add");
            System.out.println("2.ISE");
            System.out.println("3.Remove");
            System.out.println("4.Buy");
            System.out.println("5.total");
            System.out.println("-1 to out");
         boolean in=true;
        while(true){
        try{
           int i= input.nextInt();
        while(i!=-1){
            switch(input.nextInt()){
                case 1:
                    System.out.println("Enter product name ");
                    String name=input.next();
                    System.out.println("Enter product id ");
                    int id=input.nextInt();
                    System.out.println("Enter product price ");
                    double price=input.nextDouble();
                    t=new Product(name,id,price);
                    productts[0]=t;
                    m.addProducts(t);
                    System.out.println("after add product"+m.toString());
                    break;
                case 2:
                    System.out.println("Enter product name ");
                    String name2=input.next();
                    System.out.println(m.isExist(name2));
                     break;
                case 3:
                    System.out.println("Enter product name ");
                    String name3=input.next();
                    System.out.println("Enter product id ");
                    int id3=input.nextInt();
                    System.out.println("Enter product price ");
                    double price3=input.nextDouble();
                    h=new Product(name3,id3,price3);
                    m.remove(h);
                    System.out.println("the after remove the product from stor"+m.toString());
                    break;
                case 4:
                    System.out.println("Enter product name ");
                    String name4=input.next();
                    System.out.println("Enter product id ");
                    int id4=input.nextInt();
                    System.out.println("Enter product price ");
                    double price4=input.nextDouble();
                      System.out.println("Enter product name ");
                    String name42=input.next();
                    System.out.println("Enter product id ");
                    int id42=input.nextInt();
                    System.out.println("Enter product price ");
                    double price42=input.nextDouble();
                      System.out.println("Enter product name ");
                    String name43=input.next();
                    System.out.println("Enter product id ");
                    int id43=input.nextInt();
                    System.out.println("Enter product price ");
                    double price43=input.nextDouble();
                      System.out.println("Enter product name ");
                    String name44=input.next();
                    System.out.println("Enter product id ");
                    int id44=input.nextInt();
                    System.out.println("Enter product price ");
                    double price44=input.nextDouble();
                      System.out.println("Enter product name ");
                    String name45=input.next();
                    System.out.println("Enter product id ");
                    int id45=input.nextInt();
                    System.out.println("Enter product price ");
                    double price45=input.nextDouble();
                     p=new Product(name4,id4,price4);
                     h=new Product(name42,id42,price42);
                     j=new Product(name43,id43,price43);
                     k=new Product(name44,id44,price44);
                     l=new Product(name45,id45,price45);
                     products[0]=p;
                     products[1]=h;
                     products[2]=j;
                     products[3]=k;
                     products[4]=l;
                     System.out.println("Enter customer name");
                     String namec=input.next();
                     System.out.println("Enter customer id");
                     int idc=input.nextInt();
                     d=new customer(namec,idc);
                     System.out.println(m.totalPrice(products,d));
                    break;
                case 5:
                    System.out.println("Enter ptoduct name");
                    String name5=input.next();
                    m.buy(productts,name5);
                    break;
                
            
            
        }
          i=input.nextInt();
            
            
            
        }
        in=false;
        }catch(Exception inpot){
                System.out.println(inpot);
                System.err.println("Error try agine");
                input.next();
                }
        }
        

        

    }
}
