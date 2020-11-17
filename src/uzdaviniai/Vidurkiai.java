package uzdaviniai;

public class Vidurkiai {
    public static void main (String[] arg){
       int[] a = {5, 6, 10, 15, 8, 4};
       int[] b = {8, 5, 3};
       int suma1 = 0;
       int suma2 = 0;
       double vidurkis1 = 0;
        double vidurkis2 = 0;
        double skirtumas = 0;
        for (double elem: a){
            suma1 += elem;
            vidurkis1 = (double) suma1 /  a.length;
        }
       for (double elem: b){
           suma2 += elem;
           vidurkis2 = (double) suma2 /  b.length;
       }
       skirtumas = (double) vidurkis1 - (double) vidurkis2;
        System.out.println("Pirmo masyvo vidurkis yra " + vidurkis1);
        System.out.println("Antro masyvo vidurkis yra " + vidurkis2);
        System.out.println("Masyvu skirtumas yra " + skirtumas);
    }
}
