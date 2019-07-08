/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_java;
import java.util.Scanner; // Importation de la classe Scanner se trouvant dans le paquetage java.util

/**
 * Test
 * @author Morgan Fendrix
 * @version 0.02
 */
public class Learn_Java
{
    public static void main(String[] args) 
    {
        System.out.println("\t Salut à tous !");
        System.out.print("\t Je vous hais tous sans exception ! \n");
        
        byte temperature;
        temperature = 64;
        System.out.printf("\t La température de la pièce est : %d °C \n", temperature);
        System.out.println("\t La température de la pièce est : " + temperature + " °C");
        
        /* Les fuckings variables (classique)
            
            les bytes en 1 octet donc de -128 a +127
            les short en 2 octets donc de -32768 a +32767
            les int en 4 octets donc de ... et ainsi de suite
            les float en 4 octets pour les valeurs a virgule
            les long en 8 octets
            les double en 8 octets pour les valeurs a virgule
        
        */
        
        long test1 = 150000000000000L; // long implique un "L" a la fin de l'initialisation
        float pi = 3.1416f; // float implique un "f" a la fin de l'initialisation
        double patate = 10000000000d; // double implique un "d" a la fin de l'initialisation
        boolean ask = true; // boolean = soit true ou false (binaire)
        char lettre = 'c'; // char uniquement pour les caracteres unique entoure par des apostrophes
        
        String phrase; // String s'ecrit avec une majuscule !!!
        phrase = "\t Spyro est le chat le plus beau ! \n";
        
        String phrase2 = new String();
        phrase2 = "\t Spyro ne vous aimes pas ! \n";
        
        String phrase3 = new String("\t Spyro aime manger ! \n");
        
        System.out.printf(phrase + phrase2 + phrase3);
        
        int test2 = 5, test3 = 2;
        float conv = (float)test2 / (float)test3;
        System.out.println("\t Le résultat de la conversion int vers float est : "+ conv);
        
        int test4 = 12;
        String transf = new String();
        transf = transf.valueOf(test4); // transf prend la valeur de la variable test 4
        int transf2 = Integer.valueOf(transf).intValue();
        
        int test5 = 255; // En decimal
        int test6 = 0xFF; // En hexadecimal
        int test7 = 0b1111_1111; // En binaire 
        System.out.println("\t test 5 = " + test5 + " en décimal");
        System.out.println("\t test6 = " + test6 + " en héxadécimal");
        System.out.println("\t test7 = " + test7 + " en binaire qui donne : ");
        
        Scanner sc = new Scanner(System.in); // System.in correspond a l'entree
        System.out.println("\t Veuillez saisir un mot :");
        String mot = sc.nextLine();
        System.out.println("\t Veuillez saisir un nombre :");
        int nombre = sc.nextInt(); // double --> sc.nextDouble() / long --> sc.nextLong() / byte --> sc.nextByte()
        System.out.println("\t Vous avez saisi : " + mot);
        System.out.println("\t Vous avez saisi : " + nombre);
        
        System.out.println("\t Saisissez une lettre :");
        Scanner sc1 = new Scanner(System.in);
        String test8 = sc1.nextLine();
        char test9 = test8.charAt(0); // test9 prend la valeur de la premiere lettre car position 0
        System.out.println("\t Vous avez saisi le caractère : " + test9);
        
        /*  Petit point sur nextLine() et nextInt, Long, Float, Double, etc
        
            Après l'utilisation d'un nextInt, Long, Float, Double, etc, il est capital de vider la ligne
            Pour ce faire, il suffit d'un "<variable>.nextLine();" avant de pouvoir faire un nextLine
            Car celui-ci replace la tete de lecture sur une nouvelle ligne
            ATTENTION : nextChar() n'existe pas
        
        */
    }   
}
