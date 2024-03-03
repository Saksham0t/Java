import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 1);
        map.put("Russia", 2);
        map.put("America", 3);

        System.out.println(map);
        System.out.println(map.containsKey("India"));
        System.out.println(map.get("India"));
        System.out.println(map.get("Canada"));

        for( Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+"-");
            System.out.println(e.getValue());
        }
        System.out.println();
//        map.replace("America",3,  4);
//        map.remove("America");
//        System.out.println(map);

    }
}
