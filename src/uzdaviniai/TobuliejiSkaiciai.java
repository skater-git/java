package uzdaviniai;

public class TobuliejiSkaiciai {
    public static void main(String[] arg) {
        int min = 0;
        int max = 1000;
        int num = 0;
        String primeNumbers = "";
        for (min = 1; min <= max; min++) {
            int sum = 0;
            for (int e = 1; e < min; e++) {
                if ((min % e) == 0) {
                    sum += e;
                }
            }
            if (sum == min) {
                System.out.println("Tobulasis skaicius yra " + sum);
            }
        }
        for (min = 1; min <= max; min++)
        {
            int counter=0;
            for(num =min; num>=1; num--)
            {
                if(min%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + min + " ";
            }
        }
        System.out.println("Sveiki skaiciai yra:");
        System.out.println(primeNumbers);
    }
    }


