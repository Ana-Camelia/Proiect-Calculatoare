/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefix
 */
public class AccesoriiLaptop extends Calculatoare {
    String tip,culoare;
    boolean returnabil;
    AccesoriiLaptop()
    {
        super();
        tip=culoare="unknown";
        returnabil=false;
    }
    AccesoriiLaptop(float pret, String producator, int garantie, boolean refurbished,String tip, String culoare, boolean portabil)
    {
        super(pret,producator,garantie,refurbished);
        this.tip=tip;
        this.culoare=culoare;
        this.returnabil=portabil;
    }
    AccesoriiLaptop(Calculatoare C,String tip, String culoare, boolean portabil)
    {
        super(C);
        this.tip=tip;
        this.culoare=culoare;
        this.returnabil=portabil;
    }
    AccesoriiLaptop(AccesoriiLaptop A)
    {
        super(A);
        this.tip=A.tip;
        this.culoare=A.culoare;
        this.returnabil=A.returnabil;
    }
    public String toString()
    {
        return "\nTip accesoriu: "+tip+" "+producator+" "+pret+" €\n\t Garantie: "+garantie+" luni\n\t Refurbished:"+(refurbished?"Da":"Nu")+
                "\n\t Culoare: "+culoare+"\n\t Returnabil: "+(returnabil?"Da":"Nu");
    }
}

