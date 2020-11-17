package uzdaviniai;

import java.util.ArrayList;
public class Suapvalinimas {
    public static void main (String[] arg){

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            double rand = (double)Math.random() / (Math.random()) + min;


            System.out.println("Double skaicius " + rand + " Suapvalintas double skaicius =  " + Math.floor((rand + 0.0005) * 1000) / 1000);
        }


    }
}
