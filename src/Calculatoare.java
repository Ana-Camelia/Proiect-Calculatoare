/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefix
 */
public class Calculatoare {
    float pret;
    String producator;
    int garantie;
    boolean refurbished;
    //constructor fara parametri
    Calculatoare()
    {
        pret=0f;
        producator = "No name";
        garantie=0;
        refurbished=false;
    }
    //constructor cu parametri
    Calculatoare(float pret, String producator, int garantie, boolean refurbished)
    {
        this.pret=pret;
        this.producator=producator;
        this.garantie=garantie;
        this.refurbished=refurbished;
    }
    //constructor de copiere
    Calculatoare(Calculatoare C)
    {
        this.pret=C.pret;
        this.producator=C.producator;
        this.garantie=C.garantie;
        this.refurbished=C.refurbished;
    }
    //afisare instanta
    public String toString(){
        return "Calculator "+producator+" "+pret+" €\n\t Garantie: "+garantie+" luni\n\t Refurbished:"+ (refurbished?"Da":"Nu")+'\n';
    }
}