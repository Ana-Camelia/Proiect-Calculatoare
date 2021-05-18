/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefix
 */
public class Desktop extends Calculatoare {
    String standardATX;
    int ram_dt, capacitateHddDt, nrUsb,sloturiPci;
    float frecvProc;
    boolean sursaModulara;
    Desktop()
    {
        super();
        frecvProc=0f;
        ram_dt = capacitateHddDt =nrUsb = sloturiPci= 0;
        sursaModulara=false;
        standardATX="unknown";
    }
    Desktop(float pret,String producator,int garantie,boolean refurbished,float frecvProc,boolean sursaModulara,String standardATX,int ram_dt,int capacitateHddDt,int nrUsb,int sloturiPci)
    {
        super(pret,producator,garantie,refurbished);
        this.frecvProc=frecvProc;
        this.sursaModulara=sursaModulara;
        this.standardATX=standardATX;
        this.ram_dt=ram_dt;
        this.capacitateHddDt=capacitateHddDt;
        this.nrUsb=nrUsb;
        this.sloturiPci=sloturiPci;
    }
    Desktop(Calculatoare C,float frecvProc,boolean sursaModulara,String standardATX,int ram_dt,int capacitateHddDt,int nrUsb,int sloturiPci)
    {
        super(C);
        this.frecvProc=frecvProc;
        this.sursaModulara=sursaModulara;
        this.standardATX=standardATX;
        this.ram_dt=ram_dt;
        this.capacitateHddDt=capacitateHddDt;
        this.nrUsb=nrUsb;
        this.sloturiPci=sloturiPci;
    }
    Desktop(Desktop D)
    {
        super(D);
        this.frecvProc=D.frecvProc;
        this.sursaModulara=D.sursaModulara;
        this.standardATX=D.standardATX;
        this.ram_dt=D.ram_dt;
        this.capacitateHddDt=D.capacitateHddDt;
        this.nrUsb=D.nrUsb;
        this.sloturiPci=D.sloturiPci;
    }
    public String toString()
    {
        return "\nDesktop\t"+producator+" "+pret+" €\n\t Garantie: "+garantie+" luni\n\t Refurbished: "+ (refurbished?"Da":"Nu")+
                "\n\t Freceventa procesorului: " + frecvProc + "\n\t Sursa modulara: " + (sursaModulara?"Da":"Nu") + "\n\t Standard ATX: " + standardATX
                + "\n\t Capacitate RAM: " + ram_dt + "GB" + "\n\t Capacitate HDD: " + capacitateHddDt + "\n\t Numar de USB-uri: " + nrUsb +"\n\t Sloturi PCI: " + sloturiPci;
    }
}
