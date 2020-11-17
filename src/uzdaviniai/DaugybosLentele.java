package uzdaviniai;

public class DaugybosLentele {
    public static void main (String[] arg) {

        int a;
        int b;
        for (a=1; a<=12; ++a)
        {
            for (b=1; b<=12; ++b)
            {
                System.out.printf("%4d",a*b);
            }
            System.out.println();
        }
            for (int i = 2; i <= 9; i++){
                for(int j = 1; j <= 9; j++){
                    System.out.println(i + " x " + j + " = " +
                            (i * j < 10 ? " " : "") + i * j);
                }
                System.out.println();
            }
        }
    }



