package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Operation {
   Operation(){}
    public void piramide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le nomber des ligne enter 8 et 35");
        int n = sc.nextInt();
        while (n < 8 || n >35){
            System.out.println("donner le nomber des ligne");
            n = sc.nextInt();
        }
        int j,k,i;
        for (i = 0 ; i < n ; i++){
            for (j = 0 ; j < n-(i+1) ; j++){
                System.out.print(" ");
            }
            for (k = 0 ; k < n-j+i ;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }



    Runnable lamda = () -> {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le nomber des ligne enter 8 et 35");
        ArrayList espace = new ArrayList();
        ArrayList espace2 = new ArrayList();
        ArrayList etoile = new ArrayList();
        ArrayList etoile2 = new ArrayList();
        int n,i,j,k;
         n = sc.nextInt();
        while (n < 8 || n >35){
            System.out.println("donner le nomber des ligne");
            n = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (j = 0 ; j < n-(i+1) ; j++){
                //System.out.print(" ");
                espace.add("2");
            }
            for (k = 0 ; k < n-j+i ;k++){
                //System.out.print("*");
                etoile.add("*");
                etoile2.add(etoile);
            }
            espace2.add(espace);
            System.out.println(espace.size());
            System.out.println(espace.toString());
            System.out.println(espace2.toString());
            espace.clear();
            System.out.println(espace.toString());
            etoile.clear();
            //System.out.print("\n");
            System.out.println(espace2.toString());

        }




    };
}
