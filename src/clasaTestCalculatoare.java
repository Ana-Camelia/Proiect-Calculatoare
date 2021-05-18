/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefix
 */
public class clasaTestCalculatoare {
    
    Laptop l1,l2,l3;
    Server s1,s2,s3;
    Laptop[] l= {l1,l2,l3};
       clasaTestCalculatoare(){
        l1=new Laptop();
        l2=new Laptop(1000,"Toshiba",36,true,"i7","Windows",12,500,18,15.6f,true,true);
        l3=new Laptop(l2);
        l3.producator="Lenovo";
        l[0]=l1;
        l[1]=l2;
        l[2]=l3;
      /*  t1=new Trotineta();
        t2=new Trotineta("Apollo","galben",1234, true, true,3 ,false);
        t3=new Trotineta(v2,4,false);
        v[0]=v1;
        t[0]=t1;
        t[1]=t2;
        t[2]=t3;
        t[3]=new Trotineta("Apollo","alb",1200, true, false,4 ,true);
        t[4]=new Trotineta("BBBB","negru",200, true, true,3 ,true);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
*/
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
    
}
