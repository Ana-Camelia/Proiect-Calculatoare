import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Laptop> Lt= new ArrayList<Laptop>();
    static ArrayList<AccesoriiLaptop> Ac= new ArrayList<AccesoriiLaptop>();
    static ArrayList<Desktop> Ds= new ArrayList<Desktop>();
    static ArrayList<Server> Sv= new ArrayList<Server>();
    
    static void citireL()
    {
        File intrare = new File("Laptop.txt");
        int i=0;
        try{
            Scanner input= new Scanner(intrare);
            while (input.hasNextLine())
            {
                //citire din fisier cu lista
                //citireC(i,intrare);
                //for(int j=1;j<=4;j++)
                //    input.nextLine();
                Lt.add(new Laptop());
                Lt.get(i).producator=input.nextLine();
                Lt.get(i).pret=input.nextFloat();
                Lt.get(i).garantie=input.nextInt();
                input.nextLine();
                String ref=input.nextLine();
                if(ref.equals("Da"))
                    Lt.get(i).refurbished=true;
                else if(ref.equals("Nu"))
                    Lt.get(i).refurbished=false;
                Lt.get(i).SO=input.nextLine();
                Lt.get(i).procesor=input.nextLine();
                Lt.get(i).RAM=input.nextInt();
                Lt.get(i).HDD=input.nextInt();
                Lt.get(i).baterie=input.nextInt();
                Lt.get(i).diagonala=input.nextFloat();
                input.nextLine();
                ref=input.nextLine();
                if(ref.equals("Da"))
                    Lt.get(i).touchscreen=true;
                else if(ref.equals("Nu"))
                    Lt.get(i).touchscreen=false;
                ref=input.nextLine();
                if(ref.equals("Da"))
                    Lt.get(i).dedicata=true;
                else if(ref.equals("Nu"))
                    Lt.get(i).dedicata=false;
                i++;
            }
            input.close();
        } catch(FileNotFoundException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    static void citireA()
    {
        File intrare = new File("Accesorii.txt");
        int i=0;
        try{
            Scanner input= new Scanner(intrare);
            while (input.hasNextLine())
            {
                //citire din fisier cu lista
                Ac.add(new AccesoriiLaptop());
                Ac.get(i).producator=input.nextLine();
                Ac.get(i).pret=input.nextFloat();
                Ac.get(i).garantie=input.nextInt();
                input.nextLine();
                String ref=input.nextLine();
                if(ref.equals("Da"))
                    Ac.get(i).refurbished=true;
                else if(ref.equals("Nu"))
                    Ac.get(i).refurbished=false;
                Ac.get(i).tip=input.nextLine();
                Ac.get(i).culoare=input.nextLine();
                ref=input.nextLine();
                if(ref.equals("Da"))
                    Ac.get(i).returnabil=true;
                else if(ref.equals("Nu"))
                    Ac.get(i).returnabil=false;
                i++;
            }
            input.close();
        } catch(FileNotFoundException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    static void citireD()
    {
        File intrare = new File("Desktop.txt");
        int i=0;
        try{
            Scanner input= new Scanner(intrare);
            while (input.hasNextLine())
            {
                //citire din fisier cu lista
                Ds.add(new Desktop());
                Ds.get(i).producator=input.nextLine();
                Ds.get(i).pret=input.nextFloat();
                Ds.get(i).garantie=input.nextInt();
                input.nextLine();
                String ref=input.nextLine();
                if(ref.equals("Da"))
                    Ds.get(i).refurbished=true;
                else if(ref.equals("Nu"))
                    Ds.get(i).refurbished=false;
                Ds.get(i).standardATX=input.nextLine();
                Ds.get(i).ram_dt=input.nextInt();
                Ds.get(i).capacitateHddDt=input.nextInt();
                Ds.get(i).nrUsb=input.nextInt();
                Ds.get(i).sloturiPci=input.nextInt();
                Ds.get(i).frecvProc=input.nextFloat();
                input.nextLine();
                ref=input.nextLine();
                if(ref.equals("Da"))
                    Ds.get(i).sursaModulara=true;
                else if(ref.equals("Nu"))
                    Ds.get(i).sursaModulara=false;
                i++;
            }
            input.close();
        } catch(FileNotFoundException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    static void citireS()
    {
        File intrare = new File("Server.txt");
        int i=0;
        try{
            Scanner input= new Scanner(intrare);
            while (input.hasNextLine())
            {
                //citire din fisier cu lista
                Sv.add(new Server());
                Sv.get(i).producator=input.nextLine();
                Sv.get(i).pret=input.nextFloat();
                Sv.get(i).garantie=input.nextInt();
                input.nextLine();
                String ref=input.nextLine();
                if(ref.equals("Da"))
                    Sv.get(i).refurbished=true;
                else if(ref.equals("Nu"))
                    Sv.get(i).refurbished=false;
                Sv.get(i).interfataHdd=input.nextLine();
                Sv.get(i).ramS=input.nextInt();
                Sv.get(i).capHddS=input.nextInt();
                Sv.get(i).frecv_procS=input.nextFloat();
                input.nextLine();
                ref=input.nextLine();
                if(ref.equals("Da"))
                    Sv.get(i).multiproc=true;
                else if(ref.equals("Nu"))
                    Sv.get(i).multiproc=false;
                i++;
            }
            input.close();
        } catch(FileNotFoundException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    
    static void scriereL(int i)
    {
        try{
        FileWriter iesire = new FileWriter("Laptop.txt",true);
        PrintWriter output = new PrintWriter(iesire, true);
        output.append(Lt.get(i).producator+'\n');
        output.append(Float.toString(Lt.get(i).pret)+'\n');
        output.append(Integer.toString(Main.Lt.get(i).garantie)+'\n');
         if(Lt.get(i).refurbished)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.append(Lt.get(i).SO+'\n');
        output.append(Lt.get(i).procesor+'\n');
        output.append(Integer.toString(Lt.get(i).RAM)+'\n');
        output.append(Integer.toString(Lt.get(i).HDD)+'\n');
        output.append(Integer.toString(Lt.get(i).baterie)+'\n');
        output.append(Float.toString(Lt.get(i).diagonala)+'\n');
        if(Lt.get(i).touchscreen)
                output.append("Da\n");
            else
                output.append("Nu\n");
        if(Lt.get(i).dedicata)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.close();
        }
        catch (IOException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    
    static void scriereA(int i)
    {
        try{
        FileWriter iesire = new FileWriter("Accesorii.txt",true);
        PrintWriter output = new PrintWriter(iesire, true);
        output.append(Ac.get(i).producator+'\n');
        output.append(Float.toString(Ac.get(i).pret)+'\n');
        output.append(Integer.toString(Main.Ac.get(i).garantie)+'\n');
         if(Ac.get(i).refurbished)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.append(Ac.get(i).tip+'\n');
        output.append(Ac.get(i).culoare+'\n');
        if(Ac.get(i).returnabil)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.close();
        }
        catch (IOException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    
    static void scriereD(int i)
    {
        try{
        FileWriter iesire = new FileWriter("Desktop.txt",true);
        PrintWriter output = new PrintWriter(iesire, true);
        output.append(Ds.get(i).producator+'\n');
        output.append(Float.toString(Ds.get(i).pret)+'\n');
        output.append(Integer.toString(Main.Ds.get(i).garantie)+'\n');
         if(Ds.get(i).refurbished)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.append(Ds.get(i).standardATX+'\n');
        output.append(Integer.toString(Ds.get(i).ram_dt)+'\n');
        output.append(Integer.toString(Ds.get(i).capacitateHddDt)+'\n');
        output.append(Integer.toString(Ds.get(i).nrUsb)+'\n');
        output.append(Integer.toString(Ds.get(i).sloturiPci)+'\n');
        output.append(Float.toString(Ds.get(i).frecvProc)+'\n');
        if(Ds.get(i).sursaModulara)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.close();
        }
        catch (IOException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    
    static void scriereS(int i)
    {
        try{
        FileWriter iesire = new FileWriter("Server.txt",true);
        PrintWriter output = new PrintWriter(iesire, true);
        output.append(Sv.get(i).producator+'\n');
        output.append(Float.toString(Sv.get(i).pret)+'\n');
        output.append(Integer.toString(Main.Sv.get(i).garantie)+'\n');
         if(Sv.get(i).refurbished)
                output.append("Da\n");
            else
                output.append("Nu\n");
        output.append(Sv.get(i).interfataHdd+'\n');
        output.append(Integer.toString(Sv.get(i).ramS)+'\n');
        output.append(Integer.toString(Sv.get(i).capHddS)+'\n');
        output.append(Float.toString(Sv.get(i).frecv_procS)+'\n');
        if(Sv.get(i).multiproc)
                    output.append("Da\n");
                else
                    output.append("Nu\n");
        output.close();
        }
        catch (IOException ex)
        {
            System.out.printf("Eroare: %s\n",ex);
        }
    }
    public static void main(String[] args) {
        Locale locale = new Locale("us", "US");
    }
}