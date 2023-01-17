public class Main {
    public static void main(String[] args) {
        //when divide 6 with 1 and prime numbers than if sum of these numbers is equal to 6, it is perfect.

        int number = 7;
        int sum=0;

        if(number<0)
        {
            System.out.println("Invalid number.");
        }
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number)
        {
            System.out.println("Perfect number");
        }else
        {
            System.out.println("NOT Perfect number");
        }


    }
}