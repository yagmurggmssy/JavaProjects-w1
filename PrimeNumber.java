public class Main {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;
        /*if(number==2)
        {
            System.out.println("Asaldır.");
        }*/
        if(number<2){
            System.out.println("the number must be bigger than 1.");
            return;
        }
        for(int i = 2; i<=number/2 ; i++)
        {
            if(number%i==0)
            {
                isPrime = false;
            }
        }
        if(isPrime)
        {
            System.out.println("Asaldır.");
        }
        else {
            System.out.println("Asal değildir.");
        }

    }
}