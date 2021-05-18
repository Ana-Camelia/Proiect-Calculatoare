/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefix
 */
public class Laptop extends Calculatoare {
    String procesor, SO;
    int RAM, HDD, baterie;
    float diagonala;
    boolean touchscreen, dedicata;
    Laptop()
    {
        super();
        procesor=SO="unknown";
        RAM=HDD=baterie=0;
        diagonala=0f;
        touchscreen=dedicata=false;
    }
    Laptop(float pret,String producator,int garantie,boolean refurbished,String procesor,String SO,int RAM,int HDD,int baterie,float diagonala, boolean touchscreen,boolean dedicata)
    {
        super(pret,producator,garantie,refurbished);
        this.procesor=procesor;
        this.SO=SO;
        this.RAM=RAM;
        this.HDD=HDD;
        this.baterie=baterie;
        this.diagonala=diagonala;
        this.touchscreen=touchscreen;
        this.dedicata=dedicata;
    }
    Laptop(Calculatoare C,String procesor,String SO,int RAM,int HDD,int baterie,float diagonala, boolean touchscreen,boolean dedicata)
    {
        super(C);
        this.procesor=procesor;
        this.SO=SO;
        this.RAM=RAM;
        this.HDD=HDD;
        this.baterie=baterie;
        this.diagonala=diagonala;
        this.touchscreen=touchscreen;
        this.dedicata=dedicata;
    }
    Laptop(Laptop L)
    {
        super(L);
        this.procesor=L.procesor;
        this.SO=L.SO;
        this.RAM=L.RAM;
        this.HDD=L.HDD;
        this.baterie=L.baterie;
        this.diagonala=L.diagonala;
        this.touchscreen=L.touchscreen;
        this.dedicata=L.dedicata;
    }
    public String toString()
    {
        return "Laptop "+producator+" "+pret+" €\n\t Garantie: "+garantie+" luni\n\t Refurbished:"+ (refurbished?"Da":"Nu")+"\n\t Sistem de operare: "+SO+"\n\t Procesor: "+procesor+"\n\t RAM: "+RAM+" GB"+"\n\t HDD: "+HDD+" GB"+"\n\t Baterie: "+baterie+" mAh"+"\n\t Diagonala: "+diagonala+" inch\n\t Touchscreen: "+(touchscreen?"Da":"Nu")+"\n\t Placa video dedicata: "+(dedicata?"Da":"Nu")+'\n';
    }
}
