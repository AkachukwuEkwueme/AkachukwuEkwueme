import java.util.Scanner;
import java.util.Random;

public class Password {
    


public static void main(String[] args){

   // passwordRules();
    String[] savedchoices = passwordRules();
    int passlength= Integer.parseInt(savedchoices[3]);
    String password = passwordGenerator(savedchoices[0],savedchoices[1],savedchoices[2],passlength);
    System.out.println("\n Generated password: " + password);

    
    final String finalpassword = passwordCheck(password);
    System.out.println("\n The Password Result is: " + finalpassword);
   // System.out.println("Password Score: " + score);
    //System.out.println("Password Result: " + result);
    //password = passwordCheck();
    //System.out.println(passwordGenerator("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+", 15));

}
public static String[] passwordRules() { //Method for instructing rules for password
    Scanner myObj = new Scanner(System.in);
    String yes = "Y";
    String no = "N";

    System.out.println("\n Welcome to the MEDFetch App, for improving daily healthcare and making it more accessible");
    System.out.println("\n We will create you a password to keep your personal account secure");
    System.out.println("\n Note that in the password generation process, user inputs will be required for criteria for the password, and at least one of the three criteria must be selected for password to be succesfully generated");

    System.out.println("\n Hit \"enter\" to confirm and start the password Generator");
    String confirm = myObj.nextLine();

    
    System.out.println("\n Do you want to use Letters (Uppercase and Lower)? Indicate with(Y/N)");
    String firstchoice = myObj.nextLine();
    while (!firstchoice.equals(yes) && !firstchoice.equals(no)) {
        System.out.println("\n Try again! Ensure to answer Y or N!");
        firstchoice = myObj.nextLine();
        // block of code to be executed if the condition is true
      }
    System.out.println("Use of Letters: " + firstchoice);

    
    System.out.println("\n Do you want to use Numbers? Indicate with(Y/N)");
    String secondchoice = myObj.nextLine();
    while (!secondchoice.equals(yes) && !secondchoice.equals(no)) {
        System.out.println("\n Try again! Ensure to answer Y or N!");
        secondchoice = myObj.nextLine();
        // block of code to be executed if the condition is true
      }
    System.out.println("Use of Numbers: " + secondchoice);


    System.out.println("\n Do you want to use Characters? Indicate with(Y/N)");
    String thirdchoice= myObj.nextLine();
    while (!thirdchoice.equals(yes) && !thirdchoice.equals(no)) {
        System.out.println("\n Try again! Ensure to answer Y or N!");
        thirdchoice = myObj.nextLine();
        // block of code to be executed if the condition is true
      }
    System.out.println("Use of Characters: " + thirdchoice);


    System.out.println("\n Enter the desired length of the Password (between 7 and 15, preferably at least 12)");
    int passlength = myObj.nextInt();
    System.out.println("Password length: " + passlength);
    while (passlength > 15 || passlength < 7) {
        System.out.println("\n Try again! The desired length of the Password must be between 7 and 15! (at least 12 preferably)");
        passlength = myObj.nextInt();
        // block of code to be executed if the condition is true
      }
    String stringpasslength = Integer.toString(passlength);
    String[] savedchoices= {firstchoice, secondchoice, thirdchoice, stringpasslength};
    return savedchoices;
   // if(condition)
    // block of code to be executed if the condition is true
    

}
public static String passwordGenerator(String firstchoice, String secondchoice, String thirdchoice, int passlength) { //Method for Generating password
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    String yes = "Y";
    String no = "N";
    String candidateChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
    String candidateAlpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String candiadateNumeric = "1234567890";
    String candidateAlphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    String candidateSymbol = "!@#$%^&*()_+";
    String candidateAlphaSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+";
    String candidateNumaSymbols = "1234567890!@#$%^&*()_+";

    if(firstchoice.equals(yes) && secondchoice.equals(yes) && thirdchoice.equals(yes)){
        
        for (int i = 0; i < passlength; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
    }

    if(firstchoice.equals(no) && secondchoice.equals(yes) && thirdchoice.equals(yes)){
        
        for (int i = 0; i < passlength; i++) {
                sb.append(candidateNumaSymbols.charAt(random.nextInt(candidateNumaSymbols.length())));
            }
        }

    if(firstchoice.equals(yes) && secondchoice.equals(no) && thirdchoice.equals(yes)){
        
        for (int i = 0; i < passlength; i++) {
                    sb.append(candidateAlphaSymbols.charAt(random.nextInt(candidateAlphaSymbols.length())));
                }
            }

    if(firstchoice.equals(yes) && secondchoice.equals(yes) && thirdchoice.equals(no)){
        
        for (int i = 0; i < passlength; i++) {
                        sb.append(candidateAlphaNumeric.charAt(random.nextInt(candidateAlphaNumeric.length())));
                    }
                }
    if(firstchoice.equals(yes) && secondchoice.equals(no) && thirdchoice.equals(no)){
        
        for (int i = 0; i < passlength; i++) {
                                        sb.append(candidateAlpha.charAt(random.nextInt(candidateAlpha.length())));
                                    }
                                }
    if(firstchoice.equals(no) && secondchoice.equals(yes) && thirdchoice.equals(no)){
    
        for (int i = 0; i < passlength; i++) {
            sb.append(candiadateNumeric.charAt(random.nextInt(candiadateNumeric.length())));
                                 }
                                      }
            if(firstchoice.equals(no) && secondchoice.equals(no) && thirdchoice.equals(yes)){
        
             for (int i = 0; i < passlength; i++) {
                    sb.append(candidateSymbol.charAt(random.nextInt(candidateSymbol.length())));
                                  }
                            }

        while(firstchoice.equals(no) && secondchoice.equals(no) && thirdchoice.equals(no)){
            System.out.println("One must choose at least one criteria for a password to be generated! Restarting Password Generator...... ");
        }

//System.out.println("End");

    
   // else if (first choice == )
   // use else if loops for other conditions for user inputs
    return sb.toString();

}


public static String passwordCheck(String password){ //password, int score, String result) {

    int score=0;
    String result="";
    String numbers = "0123456789";
    String lowerletters = "abcdefghijklmnopqrstuvwxyz";
    String upperletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String symbols = "!@#$%^&*()_+";


    if(password.length()>10){
        score = score +2;
    }
    //all other if statements are not registering because its scanning the whole string above rather
    //than picking out one element of the numbers,letters, characters as intended
    if(password.matches(".*[0-9]+.*")== true) {
        score = score +2;
    }
    if(password.matches(".*[a-z]+.*")== true){
        score = score +2;
    }
    if(password.matches(".*[A-Z]+.*")== true){
        score = score +2;
    }
    if(password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*")|| password.contains("(") || password.contains(")") || password.contains("_")|| password.contains("+")){
        score = score +2;
    }

System.out.println("The Password Strength will be checked and graded out of 10");

    if(score==0){
        result = "Horrible Password";
    }

    if(score==2){
        result = "Poor Password";
    }

    if(score==4){
        result = "Bad Password";
    }

    if(score==6){
        result = "Decent Password";
    }

    if(score==8){
        result = "Good Password";
    }
    if(score==10){
        result = "Amazing and secure Password!!! Welcome to MEDFetch!!! ";
    }

    System.out.println("\n The Password Score is: " + score + "/10");
return result;
    //Method for checking strength for password

}

}