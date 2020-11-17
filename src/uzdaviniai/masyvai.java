package uzdaviniai;

public class masyvai {
    public static void main(String[] args) {
        int rezultatas = 1;
       int suma = 100;
       for (int i = 2; i <= suma; i++){
           System.out.println(rezultatas + " + " + i + " =");
           rezultatas = rezultatas + i;
           System.out.println(rezultatas);
       }
    }
}
