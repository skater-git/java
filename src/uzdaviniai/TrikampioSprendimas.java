package uzdaviniai;

public class TrikampioSprendimas {

    public static void main(String[] arg){
        int a = 4;
        int b = 4;
        int c = 4;
        double pusperimetras = 0;
        double plotas = 0;
        boolean trikampis = false;
        pusperimetras = (a + b + c) / 2;
        plotas = (pusperimetras * (pusperimetras - a) * (pusperimetras - b) * (pusperimetras - c));
        plotas = Math.sqrt(plotas);
        if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
            System.out.println("Ne trikampis");
        else {
            trikampis = true;
        }
         if(a == b && b == c && a == c && (boolean) trikampis == true)
            System.out.println("Lygiakrastis trikampis");
         else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a) && (boolean) trikampis == true)
            System.out.println("Lygiasonis trikampis");
        else if(a!=b && b!=c && c!=a && (boolean) trikampis == true)
            System.out.println("Ivairiakrastis trikampis");
        if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
            System.out.println("Status trikampis");
        if( (boolean) trikampis == true)
            System.out.println("Trikampio plotas " + plotas);
    }

}

