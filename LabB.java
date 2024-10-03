import java.util.Scanner;
public class LabB {
    static String username="";
    static String password="";
    static String usernameinput="";
    static String passwordinput="";
    public static void main(String[]args){
    Scanner kb = new Scanner(System.in);
    System.out.println("What is your username?");
    username = kb.next();
    System.out.println("What is your password?");
    password = kb.next();
    askforstuff();
    passcheck(usernameinput, passwordinput);
    }
    static void passcheck(String u, String p){
    if(u.equals(username)){
    if(p.equals(password)){
    System.out.println("You are granted acess!");
    }else{
    System.out.println("Your password is incorrect!\n");
    askforstuff();
    passcheck(usernameinput, passwordinput);
    }
    } else {
    if(p.equals(password)){
        System.out.println("Your username is incorrect\n");
        askforstuff();
        passcheck(usernameinput, passwordinput);
    }else{
        System.out.println("Your username and password are incorrect!\n");
        askforstuff();
        passcheck(usernameinput, passwordinput);
    }
    }
    }
    static void askforstuff(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your username");
        usernameinput = kb.next();
        System.out.println("Enter your password");
        passwordinput = kb.next();
    }
}
