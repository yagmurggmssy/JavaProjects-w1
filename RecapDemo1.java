public class Main {
    public static void main(String[] args) {
        int sayi1= 20;
        int sayi2= 25;
        int sayi3= 2;

        int max=sayi1;

        if(max<sayi2){
            max=sayi2;
        }
        if (max<sayi3){
            max=sayi3;
        }
        System.out.println("En büyük : " + max);
    }
}