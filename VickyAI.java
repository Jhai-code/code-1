import java.util.Scanner;
public class VickyAI {
    public  static String condition(String input) {
        if (input.equals("Hello")){
            return "Hi,How can I help you";
        }
        else if (input.equals("what can you do?")){
            return "Sure! I can help in various way ,I am your friendly chatbot!";
        }
        else if(input.equals("who created you?")){
            return "JHAI VIGNESH created VickyAI";
        }
        else if(input.equals("Bye")){
            return "Bye!";
        }
        else{
            return "Sorry! give me correct command";
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
      
      
        System.out.println("chatbot is ready to speak");
        while (true) {
            System.out.print("You:-  ");
            String input = scan.nextLine();
            if (input == "bye") {
                System.out.println("Goodbye! closed");
                break;
            }
            String result = condition(input);
            System.out.println("Chatbot: " + result);
        }
     
    }
}