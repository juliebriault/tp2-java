/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author estelle
 */
public class PileEntiers extends Pile { // PileEntiers hérite de Pile
    
    public PileEntiers()
    {
        super(); // constructeur de la classe mère : Pile
    }
    
    /**
     *
     * @return
     */
    @Override // car on redéfinit la méthode "Dépiler" déjà définie dans la classe mère
    public Integer Depiler()
    {
        // on caste en Integer
        return (Integer) super.Depiler(); // super : réf. à la classe mère donc appel méthode Déplier de la classe mère
    }
    
    /**
     *
     * @param e
     */
    public void Empiler(Integer e) // cast : on change "Object" en "Integer"
    {
        super.Empiler(e);
    }
}
