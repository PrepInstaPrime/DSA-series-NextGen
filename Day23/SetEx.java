import java.util.HashSet;
class SetEx{
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set);
        System.out.println(set.contains(1));
        for(int val:set){
            System.out.println(val);
        }
        System.out.println(set.size());
        set.remove(2);
        System.out.println(set);
        set.clear();
        System.out.println(set);

    }
}