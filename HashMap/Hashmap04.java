// Question - Find Itinerary(jounry) form tickets

import java.util.*;
public class Hashmap04{
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;

    }

    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "dehli");
        tickets.put("goa", "chennai");
        tickets.put("dehli", "goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}