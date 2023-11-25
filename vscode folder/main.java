import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      //Account login
    System.out.println("Enter your first and last name");
      String teacherName = sc.nextLine();
      System.out.println("Enter your 6 digit teacher ID");
      String identification = sc.nextLine();
    while (identification.length() != 6) {
      System.out.println("Invalid. Please retype.");
      identification = sc.nextLine();
    }
      System.out.println("Choose a password (Minimum 6 Characters)");
      String password = sc.nextLine();
    while (password.length() < 6) {
      System.out.println("Please enter a new password (minimum of 6 characters)");
      password = sc.nextLine();
    }
    //Creates a password
      boolean confirmed = false;
      String checkPassword;
        while(!confirmed){
            System.out.println("Confirm your password");
            checkPassword = sc.nextLine();
            if (checkPassword.equals(password)){
                confirmed = true;
                System.out.println("Password Matches");
            }
            else {
                System.out.println("Password doesn't match. Try Again");
            }
        }

      //interests
      //music, sports, movies/shows, books, travel, food, other
      ArrayList <String> interests = new ArrayList <String>();
    System.out.println("What kind of music do you like?");
      System.out.println("Pop, Rap, Country, K-Pop, R&B, Rock, Classical, Jazz, Other, None");
      String input = sc.nextLine();
      interests.add(input);
      
      System.out.println("Enter what sports you like?");
    System.out.println("Soccer, Football, Baseball, Hockey, Basketball, Volleyball, Marshal Arts, Driving, None");
        input = sc.nextLine();
      interests.add(input);
        
      System.out.println("What kind of movies/shows do you like?");
    System.out.println("Action, Adventure, Comedy, Drama, Horror, Romance, None");
        input = sc.nextLine();
      interests.add(input);

    System.out.println("What kind of books do you like?");
  System.out.println("Fantasy, Romance, Historical, Science Fiction, Thriller, Horror, Fiction, Non-Fiction, None");
        input = sc.nextLine();
      interests.add(input);

    System.out.println("Where would you want to travel?");
  System.out.println("Europe, Asia, Africa, North America, South America, Oceania, Antartica, None");
       input = sc.nextLine();  
      interests.add(input);

    System.out.println("What kind of food do you like?");
  System.out.println("Italian, Chinese, French, Indian, Thai, Vietnamese, Japanese, Mongolian, Persian, Korean, Mexican, American, Greek, Turkish, Other");
      input = sc.nextLine();
      interests.add(input);

      System.out.println("Your interests: " + interests);


      //Example person 1
      String[] profile1 = {"Rap", "Soccer", "Action", "None", "North America", "Mexican"};
    //Example person 2
        String[] profile2 = {"K-Pop", "Hockey", "Drama", "Romance", "Europe", "Greek"};
while (true){
    System.out.println("Name: Samantha");
      System.out.println("Interests:");
      for (int i = 0; i<profile1.length; i++){
          System.out.println(profile1[i]);
      }
      System.out.println("Swipe Left or Right?");
      input = sc.nextLine();
      if (input.equals("Right")) {
          int matchCounter = 0;
          int smallerSize = Math.min(interests.size(), profile1.length); // Find the smaller size

          for (int j = 0; j < smallerSize; j++) {
              if (interests.get(j).equalsIgnoreCase(profile1[j])) {
                  matchCounter++;
              }
          }

          if (matchCounter > 3) {
              System.out.println("Match");
              System.out.println("You can now exchange socials");
              break;
          } else {
              System.out.println("No matches. Better luck next time!");
          }
      }
          System.out.println("Name: Stepan");
            System.out.println("Interests:");
            for (int i = 0; i<profile2.length; i++){
                System.out.println(profile2[i]);
            }
            System.out.println("Swipe Left or Right?");
            input = sc.nextLine();
            if (input.equals("Right")) {
                int matchCounter = 0;
                int smallerSize = Math.min(interests.size(), profile2.length); // Find the smaller size

                for (int j = 0; j < smallerSize; j++) {
                    if (interests.get(j).equalsIgnoreCase(profile2[j])) {
                        matchCounter++;
                    }
                }

                if (matchCounter > 3) {
                    System.out.println("Match");
                    System.out.println("You can now exchange socials")
                    break;
                } else {
                    System.out.println("No matches. Better luck next time!");
                }
      } 
  }
}
}