public class Main {
    public static void main(String[] args) {

        char letter = 'Ö';
        switch(letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Letter is bass.");
                break;
                //we can set default for remainders but if input is not vowel, than our code will be wrong.
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Letter is high.");
        }
    }
}