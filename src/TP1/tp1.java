/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;
import java.util.Scanner;

/**
 *
 * @author Morgan Fendrix
 */
public class tp1 
{
    public static void main(String[] args)
    {
        // Initialisation de l'objet Scanner
        Scanner sc = new Scanner(System.in); 
        
        // Initialisation des variables
        double ToConv, Conv = 0;
        char answer = 'O', selection =' ';
        
        System.out.println("-------------------------------------------------");
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("-------------------------------------------------");
        
        while (answer == 'O')
        {
            while (selection == ' ' || selection == '1' || selection == '2')
            {
                System.out.println("Choississez le mode de conversion :");
                System.out.println("1 - Convertisseur Celsius - Farhenheit");
                System.out.println("2 - Convertisseur Farhenheit - Celsius");
                selection = sc.nextLine().charAt(0); 
            }
            System.out.println("Mauvaise réponse, veuillez réitérer !");
        }
        System.out.println("Au revoir !");
                    
                
        
        
        
    }
    
}
