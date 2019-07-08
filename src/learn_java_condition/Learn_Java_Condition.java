/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_java_condition;
import java.util.Scanner; // Importation de la classe Scanner se trouvant dans le paquetage java.util

/**
 *
 * @author Morgan Fendrix
 */
public class Learn_Java_Condition 
{
    public static void main(String[] args)
    {
        int test1 = 0; // Declaration et initialisation de la variable test1
        if (test1 < 0) // Condition qui verifie que test1 est plus petit que 0
            System.out.println("Le nombre est négatif !");
        else if (test1 > 0) // Condition qui vérifie que test1 est plus grand que 0
            System.out.println("Le nombre est positif !");
        else 
            System.out.println("Ce nombre est nul, tout comme toi !");
        // L'utilisation d'un else if est capital, car il ne peut y avoir plusieurs else a la suite
        
        /* Cours sur les conditions et operateurs
            
            les operateurs logiques nous servent a evaluer une ou plusieurs conditions
                == : Test d'egalite
                != : Test d'inegalite
                <  : strictement inferieur
                <= : inferieur ou egal
                >  : strictement superieur
                >= : superieur ou egal
                && : operateur ET (Si tout est vrai alors vrai)
                || : operateur OU (Si un est vrai alors vrai)
                ? : operateur ternaire
        
            les conditions n'ont pas besoin d'accolades si il n'y a qu'une instruction contenu
        
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = sc.nextInt();
        if (nbr < 100 && nbr > 50) // Condition qui verifie que le nombre est strictement inferieur a 100 et strictement superieur a 50
            System.out.println("Le nombre est compris dans l'intervalle !");
        else
            System.out.println("Le nombre n'est pas dans l'intervalle !");
        
        sc.nextLine(); // Nettoyage de la ligne avant relecture
        System.out.println("Veuillez saisir votre note :");
        int note = sc.nextInt();
        switch (note)
        {
            case (0): // Dans le cas ou la note est egal a 0
                System.out.println("Try again !");
                break;
            case 10: // Dans le cas ou la note est egal a 10
                System.out.println("La moyenne mdrrr !");
                break;
            case 20: // Dans le cas ou la note est egal a 20
                System.out.println("Well played !");
                break;
            default: // Dans tout les autres cas
                System.out.println("Go rage quit mon gars !");
        }
        // On peut aussi utiliser des String dans un switch
        
        int test2 = 10, test3 = 20; // Concatenation de déclaration et d'initialisation de variable int
        int test5 = (test2 < test3) ? test3 * 2 : test2 * 3;
        System.out.println("La valeur de test5 est : " + test5);
        
        /* La condition ternaire
        
            Ce qui se trouve entre parentheses est evalue, si vrai alors test5 sera egal a
            la valeur se trouvant apres le "?" sinon test5 sera egal a la valeur apres le ":"
        
        */
    }    
}
