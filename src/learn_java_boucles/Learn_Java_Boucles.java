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
        /*
                                Premiere methode (while)
        */
        
        String name; // Declaration variable type String
        char answer = 'O'; // Declaration variable type char, initialisation de celle-ci
        Scanner sc = new Scanner(System.in);
        
        while(answer == 'O') // Tant que answer est egal a "O"
        {
            System.out.println("Donnez un prénom :");
            name = sc.nextLine();
            System.out.println("Bonjour " + name + ", espèce de moche !");
            answer = ' ';
            
            while(answer != 'O' && answer != 'N')
            {
                System.out.println("Voulez-vous réessayer ? (O/N)");
                answer = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Salut pauvre tâche !");
        
        /*
                                Deuxieme methode (do - while)
        */
        
        String age;
        char answer2 = ' ';
        Scanner sc2 = new Scanner(System.in);
        
        do
        {
            System.out.println("Donnez votre âge :");
            age = sc2.nextLine();
            System.out.println("Vous avez " + age + " ans");
            
            do
            {
                System.out.println("Voulez-vous réessayer ? (O/N)");
                answer2 = sc.nextLine().charAt(0);
            }while(answer2 != 'O' && answer2 != 'N');
        }while(answer2 == 'O');
        
        /*
                                Troisieme methode (for)
        */
        
        for(int test = 1;test <= 10;test++)
        {
            System.out.println("Voici la ligne " + test);
        }
        
        for(int test1 = 10;test1 >= 0;test1--)
            System.out.println("Il reste " + test1 + "ligne(s) à écrire");
        
        for(int test2 = 0, test3 = 2;(test2 < 10 && test3 < 6); test2++, test3+=2)
        {
            System.out.println("test2 = " + test2 + ", test3 = " + test3);
        }
    }
}
