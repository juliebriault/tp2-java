/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.*;

/**
 *
 * @author estelle
 */
public class Liste {

    private int position; // position de l'élément
    private final ArrayList<Object> myArrayList; // liste d'objets

    public Liste() // constructeur
    {
        position = 0;
        this.myArrayList = new ArrayList<Object>(); // création d'un ArrayList d'Objects
    }

    public int GetPosition() {
        return this.position;
    }

    public void SetPosition(int pos) {
        this.position = pos;
    }

    public void Premier() // se positionne sur le 1er objet de la liste
    {
        this.SetPosition(0); // à l'élément d'indice 0
    }

    public void Dernier() // se positionne sur le dernier objet de la liste
    {
        if (myArrayList.isEmpty()) // si la liste est vide / équivalent à if(myArrayList.size()==0)
        {
            System.out.println("Vous ne pouvez pas accéder au dernier élément : la liste est vide");
            this.SetPosition(0); // l'élément courant se remet à l'indice 0
        } else {
            this.SetPosition(myArrayList.size()); // taille-1 : dernière case du tableau
        }
    }

    public Object Suivant() // retourne l'objet suivant de celui sur lequel on est positionné
    {
        if ((myArrayList.isEmpty())) // si liste vide
        {
            System.out.println("Liste vide");
            return null; // return un objet vide
        } else if (this.position == this.myArrayList.size()) // si on a déjà atteint le dernier élément
        {
            System.out.println("On est au dernier élément de la liste, on ne peut pas en ajouter davantage");
            return null; // return un objet vide
        } else {
            this.SetPosition(this.position + 1); // accès à l'élément suivant
            return this.myArrayList.get(this.position); // return l'objet à cet indice là
        }
    }

    public Object Supprimer() // supprime et retourne l'objet sur lequel on est positionné
    {
        if (myArrayList.isEmpty()) {
            System.out.println("Liste vide");
            return null; // return un objet vide
        } else {
            return myArrayList.remove(this.position);
        }
    }

    public void Ajouter(Object o) // objet à ajouter dans l'élément sur lequel on est positionné
    {
        myArrayList.add(position, o); // ajoute l'objet o à l'indice position dans le tableau
    }

    public void AfficherListe() {
        for (Object elem : myArrayList) {
            System.out.println(elem);
        }
    }
}
