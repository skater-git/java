package uzdaviniai;

public class Ciklai {
    public static void main(String[] arg) {
        int[] masyvas = {-10, 0, 2, 9, -5};
        int temp = 0;
        System.out.println("Originali skaiciu tvarka");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i+1; j < masyvas.length; j++){
                if (masyvas[i] > masyvas[j]){
                    temp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Didejanti skaiciu seka");
        for (int i = 0; i < masyvas.length; i++){
            System.out.print( masyvas[i] + " ");
        }
    }
}