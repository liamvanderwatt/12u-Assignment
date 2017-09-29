/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

/**
 *
 * @author vandl4973
 */
public class javamethods {

    public void bobsayshello(){
        System.out.println("Bob says Hello");
    }
    public int bobdoesmath(int start, int end){
        int sum = 0;
        for (int i =start; i<=end; i++){
         sum+= i;  
        } 
        return sum;
    }
    public void bobsayshello(String name){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // create object to run methods
        javamethods test = new javamethods();
        test.bobsayshello();
        test.bobsayshello("Moon");
        int total = test.bobdoesmath(5,10);
        System.out.println(total);
        
    }
}
