/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2.pkg3;

/**
 *
 * @author DELL
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        
        do {
            System.out.println("Enter Football Score Ex Thai 2-0 UAE \n Exit Please Enter");
            input = sc.nextLine();
            
            Football1 football1 = new Football1();
            Football2 football2 = new Football2();
             Football football = new Football();
            
            if( ! input.isEmpty()){
                football.register(football1);
                 football.register(football2);
                  football.setInputData(input);
            }
        }
        while (!input.isEmpty());
        sc.close();
        
    }
    
}
