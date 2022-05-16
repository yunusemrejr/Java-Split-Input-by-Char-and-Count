import java.util.Scanner;



public class Main {



    public static void main(String[] args) {
        String sentence;

        System.out.println("Type-in a sentence here: ");
        Scanner scanner = new Scanner(System.in);
        sentence = scanner.nextLine();

        if(sentence.length()>10000){
            System.out.println("Oops! It is over 10K characters. Try something shorter.");
        }else {
            int i;
            String[] results = new String[sentence.length()];
            for (i = 0; i < sentence.length(); i++) {

                 System.out.println(sentence.charAt(i));

            }
        System.out.println("\nLetter count: "+i+" !!!!");

            System.out.println("Your sentence was: "+sentence);


        }


    }



}
