import java.util.*;
public class Hashmap01{
    
    public static void main(String args[]){
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Intertion
        map.put("India", 120);
        map.put("US", 48);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);

        System.out.println(map);

        // Search
        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println("population of china :" + map.get("China"));  // key exist
        System.out.println(map.get("Indonesia")); // key is not exits


        // Iteration in hashmap

        // int arr[] = {4, 9, 3};
        // for(int i=0; i<3; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();


        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }

        // 2ND method

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        // remove
        map.remove("China");
        System.out.println(map);


    }
}