/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author estelle
 */
public class Pile {
    
    private final Liste maListe;
    
    public Pile()
    {
        this.maListe = new Liste(); // on crée une liste lorsque l'on crée une pile car relation de composition
    }
    
    public Liste GetListe()
    {
        return this.maListe;
    }
    
    public void Empiler(Object o)
    {
        maListe.Dernier();
        maListe.Ajouter(o);
    }
    
    public Object Depiler()
    {
        maListe.Dernier();
        return maListe.Supprimer();   
    }
    
    public void AfficherPile()
    {
        //maListe.Dernier();
        maListe.AfficherListe();
    }
}