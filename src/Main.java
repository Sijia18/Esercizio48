import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> hashSet = myHash();

        String myObj = "Element2";
        hashSet.add(myObj);

        if (hashSet.contains(myObj)) {
            System.out.println(myObj + " is in my HashSet");
        } else {
            System.out.println(myObj + " isn't in my HashSet");
        }
    }

    public static HashSet<String> myHash() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");
        return hashSet;
    }
}