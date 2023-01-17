public class Main {
    public static void main(String[] args) {
        char grade = 'E';
        switch(grade){
            case 'A':
                System.out.println("Pass");
                break;
            case 'E':
            case 'F': //ikisi de aynı çıktıyı verir, same
                System.out.println("Failed");
                break;
            default:
                System.out.println("Unexpected character.");
        }
    }
}