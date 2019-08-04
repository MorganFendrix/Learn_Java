/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brouillon;

import java.util.Scanner;

/**
 *
 * @author Morgan Fendrix
 */
public class Brouillon1 
{
    public static void main(String[] args)
    {
        System.out.println("Saississez un mot :");
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        char test1 = test.charAt(3);
        System.out.println("Voici le mot : " + test);
        System.out.println("Voici la troisième lettre (à la quatrième position de la chaîne) : " + test1);
        
    }
    
    
}
