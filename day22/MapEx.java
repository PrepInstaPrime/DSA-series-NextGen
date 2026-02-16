import java.util.HashMap;

class MapEx{
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        // put -> helps us to put value in map
        map.put("Apple",5);
        map.put("Mango", 4);
        System.out.println(map);
        // get -> access the value from map with key
        System.out.println(map.get("Apple"));
        // getOrDefault() -> if key is there in map give original value but if key is not there return default value
        System.out.println(map.getOrDefault("Mango1", 0));
        // containskey()-> checks if key is there in map
        System.out.println(map.containsKey("apple"));
        // remove -> removes the property
        map.remove("Mango");
        System.out.println(map);
        map.clear();
        System.out.println(map);
        
    }
}