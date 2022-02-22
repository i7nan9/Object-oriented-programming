/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hdeel
 */
import java.util.Scanner;
import java.io.FileReader;
public class file {

    /**
     * @param args the command line arguments
     */
    static Scanner hadeel=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
          try{

            FileReader fout=new FileReader("product.txt");
            int c;
            while((c=fout.read())!=-1){
                System.out.print((char) c);
            }
            
        }
        catch(Exception e){
            
        }
        
    }
    
}
