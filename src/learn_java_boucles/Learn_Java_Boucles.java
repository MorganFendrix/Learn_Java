/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_java_boucles;
import java.util.Scanner; // Importation de la classe Scanner

/**
 *
 * @author Morgan Fendrix
 */
public class Learn_Java_Boucles 
{
    public static void main(String[] args)
    {
        String name; // Declaration variable type String
        char answer = 'O'; // Declaration variable type char, initialisation de celle-ci
        Scanner sc = new Scanner(System.in);
        
        while(answer == 'O') // Tant que answer est egal a "O"
        {
            System.out.println("Donnez un prénom :");
            name = sc.nextLine();
            System.out.println("Bonjour " + name + ", espèce de moche !");
            System.out.println("Voulez-vous réessayer ? (O/N)");
            answer = sc.nextLine().charAt(0);
        }
        System.out.println("Salut pauvre tâche !");
        
    }
    
}
