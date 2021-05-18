/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefix
 */
public class Server extends Calculatoare {
    String interfataHdd;
    int capHddS,ramS;
    float frecv_procS;
    boolean multiproc;
    Server()
    {
        super();
        interfataHdd="unknown";
        capHddS=ramS=0;
        frecv_procS=0f;
        multiproc=false;
    }
    Server(float pret,String producator,int garantie,boolean refurbished,String interfataHdd,int capHddS,int ramS,float frecv_procS, boolean multiproc)
    {
        super(pret,producator,garantie,refurbished);
        this.interfataHdd=interfataHdd;
        this.capHddS=capHddS;
        this.ramS=ramS;
        this.frecv_procS=frecv_procS;
        this.multiproc=multiproc;
    }
    Server(Calculatoare C,String interfataHdd,int capHddS,int ramS,float frecv_procS, boolean multiproc)
    {
        super(C);
        this.interfataHdd=interfataHdd;
        this.capHddS=capHddS;
        this.ramS=ramS;
        this.frecv_procS=frecv_procS;
        this.multiproc=multiproc;
    }
    Server(Server S)
    {
        super(S);
        this.interfataHdd=S.interfataHdd;
        this.capHddS=S.capHddS;
        this.ramS=S.ramS;
        this.frecv_procS=S.frecv_procS;
        this.multiproc=S.multiproc;
    }
    public String toString()
    {
        return "\nServer " +producator+" "+pret+" €\n\t Garantie: "+garantie+" luni\n\t Refurbished:"+ (refurbished?"Da":"Nu")+
                "\n\t Interfata HDD:" + interfataHdd + "\n\t Capacitatea de: " + capHddS + " TB" + "\n\t Capacitate RAM: " + ramS + "\n\t Frecventa Procesor: " + frecv_procS+ "\n\t Multiprocesor: " + (multiproc?"Da":"Nu");
    }
}

