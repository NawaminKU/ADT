public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();

        // add
        a.add(50);
        a.add(70);
        a.add(40);
        a.add(60);
        a.add(20);
        String s = "[20, 40, 50, 60, 70]";
        if (a.toString().equals(s)) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
        
        // remove
        a.remove(50);
        s = "[20, 40, 60, 70]";
        if (a.toString().equals(s)) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
    }
}