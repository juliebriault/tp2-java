/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author estelle
 */
public class Test { // méthode main()

    public static void main(String args[]) {

        PileEntiers P1 = new PileEntiers();
        PileEntiers P2 = new PileEntiers();
        PileEntiers P3 = new PileEntiers();

        for (int i = 0; i < 5; i++) {
            int rand = (int) (Math.random() * 80) + 1; // 5 entiers aléatoires de 1 à 80
            P1.Empiler(rand); // une fois les 5 entiers générés, on les mets dans la pile P1
            
            if (rand % 2 == 0) // si le nb obtenu par le rand est divisible par 2 (pair)
            {
                P2.Empiler(rand);
            } else if (rand % 2 != 0) {
                P3.Empiler(rand);
            }
        }
        
        System.out.println("Contenu de la pile P1 :");
        P1.AfficherPile();
        System.out.println("Contenu de la pile P2 :");
        P2.AfficherPile();
        System.out.println("Contenu de la pile P3 :");
        P3.AfficherPile();
    }
}
