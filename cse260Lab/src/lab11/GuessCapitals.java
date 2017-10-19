package lab11;
import java.util.*;
import java.io.*;

public class GuessCapitals {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String[][] stateCapital = {
            {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahasse"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Indiana", "Indianapolis"},
        {"Iowa", "Des Moines"},
        {"Kansas", "Topeka"},
        {"Kentucky", "Frankfort"},
        {"Louisiana", "Baton Rouge"},
        {"Maine", "Augusta"},
        {"Maryland", "Annapolis"},
        {"Massachusettes", "Boston"},
        {"Michigan", "Lansing"},
        {"Minnesota", "Saint Paul"},
        {"Mississippi", "Jackson"},
        {"Missouri", "Jefferson City"},
        {"Montana", "Helena"},
        {"Nebraska", "Lincoln"},
        {"Nevada", "Carson City"},
        {"New Hampshire", "Concord"},
        {"New Jersey", "Trenton"},
        {"New York", "Albany"},
        {"New Mexico", "Santa Fe"},
        {"North Carolina", "Raleigh"},
        {"North Dakota", "Bismark"},
        {"Ohio", "Columbus"},
        {"Oklahoma", "Oklahoma City"},
        {"Oregon", "Salem"},
        {"Pennslyvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
       };

       Map<String, String> map = new HashMap<String, String>();
       for(int i = 0; i < stateCapital.length; i++){
           map.put(stateCapital[i][0].toLowerCase(), stateCapital[i][1]);
       }
       
       System.out.print("Enter a state: ");
       String state = sc.nextLine().toLowerCase().trim();
       if(map.containsKey(state)){
           System.out.println("The capital is: " + map.get(state));
       }
       else{
           System.out.println("No such state");
       }
    }
}
