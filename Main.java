package com.company;
import java.util.Scanner;


public class Main {
    public String Is_it_Equilibrium(int n, int arr[][]) {
        int x = 0, y = 0, z = 0;
        if (n >= 1 && n <= 100 ) {
            for (int i = 0; i < n; i++) {
                x += arr[i][0];
                y += arr[i][1];
                z += arr[i][2];
            }
            if ( x>= -100 && x<= 100 && y>= -100 && y<=100 && z>= -100 && z<=100 ) {


                if (x == 0 && y == 0 && z == 0)
                    return "Yes";
                else
                    return "NO";
            }else
                return "Forces out of Range";
        }
        else
            return " Input n is Out of Range";
    }


}




