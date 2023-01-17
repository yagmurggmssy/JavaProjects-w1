public class Main {
    public static void main(String[] args) {
        //FOR LOOP
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("ForLoop is over");

        int i=2;
        //WHILE LOOP
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Loop is over");

        //DO-WHILE
        //döngü çalışmasa bile o döngüye loglandığını belirtmek için tercih edilir.
        i = 145;
        do{
            System.out.println(i);
            i+=2;
        }while(i<10);
        System.out.println("Do-While Loop is over.");
    }

}