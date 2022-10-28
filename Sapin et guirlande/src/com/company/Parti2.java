package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Parti2 {
    public void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer nomber des ligne");
        int l = sc.nextInt();
        while (l < 8 || l > 35) {
            System.out.println("Entrer nomber des ligne");
            l = sc.nextInt();
        }

    }
}
