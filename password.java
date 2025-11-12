import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {
        int attempt = 0;
        String password = "Bhogekar@2005";
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter password : ");
            String userEnteredPassword = input.next();
            if(userEnteredPassword.equals(password)){
                System.out.println("Access Granted!!");
                break;
            }else{
                attempt ++;
                System.out.println("Attempts left : " + (3-attempt));
                if(attempt == 3){
                    System.out.println("Your attempts are over!!");
                }
            }
        }while (attempt != 3);
    }
}