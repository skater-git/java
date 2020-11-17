package uzdaviniai;

import java.math.BigInteger;
public class Demo1 {
    public static void main(String[] arg) {
        BigInteger X = new BigInteger("1");
        BigInteger Z = new BigInteger("2");
        BigInteger Suma = new BigInteger("0");
        int lentosKrastoDydis = 8;
        for (char stulpelis = 'a'; stulpelis <= 'a' + lentosKrastoDydis - 1; stulpelis++) {
            for (int eilute = 1; eilute <= lentosKrastoDydis; eilute++) {
                System.out.println("Langelyje " + stulpelis + eilute + " yra " + X + " grudu");
                Suma = Suma.add(X);
                X = X.multiply(Z);
            }
        }
        System.out.println("viso ant sachmatu lentos yra " + Suma + " grudai");
    }
}
