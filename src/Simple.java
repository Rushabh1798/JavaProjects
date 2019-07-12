
import java.util.*;

public class Simple {
    public static void main(String[] args) {
        HashMap<Integer, String> sumit = new HashMap<>();
        sumit.put(1, "sumit");
        sumit.put(5, "sumit");
        sumit.put(3, "sumit");
        sumit.put(9, "sumit");
        sumit.put(7, "sumit");

        for (Map.Entry s : sumit.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
        System.out.println(sumit);

        LinkedHashMap<Integer, String> sumit2 = new LinkedHashMap<>();
        sumit2.putAll(sumit);
        sumit2.putIfAbsent(6, "demodata");

        for (Map.Entry s : sumit2.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }


        TreeMap<Integer, String> sumit3 = new TreeMap<>();
        sumit3.putAll(sumit2);

        for (Map.Entry s : sumit3.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }

        TreeSet<User> userlist = new TreeSet<>();
        userlist.add(new User(16, "POI"));
        userlist.add(new User(18, "FUId"));
        userlist.add(new User(17, "UIO"));
        userlist.add(new User(21, "KIF"));
        userlist.add(new User(61, "AJAY"));
        userlist.add(new User(19, "HGJ"));
        userlist.add(new User(12, "KJL"));
        userlist.add(new User(16, "Abc"));

        System.out.println(userlist);
    }
}
