import java.util.ArrayList;
/**
 * ADT get Integer is not contain duplicate and must be sorted in ascending order.
*/

public class IntegerSet {
    ArrayList<Integer> Numbers;

    // -----------------------------------------------------
    // Abstraction Function (AF):
    //  - AF(Numbers) = the set of integers in the Integer Numbers.
    // -----------------------------------------------------
    // Rep Invariant (RI):
    //  - Numbers must not contain duplicate integer.
    //  - Numbers must not contain NULL.
    //  - Integer in Numbers must be sorted in ascending order.
    // -----------------------------------------------------
    
    /**
     * Constructor is starting to free set.
     */
    public IntegerSet() {
        Numbers = new ArrayList<>();
        CheckRep();
    }

    /**
     * check to Rep Invariant is true or false.
     */
    private void CheckRep() {
        if (Numbers == null) {
            throw new RuntimeException("Number must not contain NULL.");
        }
        if (Numbers.size() > 1) {
            for (int i = 0; i < Numbers.size() - 1; i++) {
                if (Numbers.get(i) >= Numbers.get(i + 1)) {
                    throw new RuntimeException("Error!!");
                }
            }
        }
    }

    /**
     * add number in set
     * @param x
     */
    public void add(Integer x) {
        if (!Numbers.contains(x) && Numbers != null && x != null) {
            if (Numbers.size() == 0) {
                Numbers.add(x);
            } else { 
                if (Numbers.get(0) > x) {
                    Numbers.add(0, x);
                } else {
                    for (int i = 0; i < Numbers.size(); i++) {
                        if (i == Numbers.size() - 1) {
                            Numbers.add(x);
                            break;
                        } 
                        if (Numbers.get(i) < x && x < Numbers.get(i + 1)) {
                            Numbers.add(i+1, x);
                            break;
                        }
                    }
                }
            }
        }
        CheckRep();
    }
    
    /**
     * remove number in set
     * @param x
     */
    public void remove(Integer x) {
        if (Numbers.contains(x) && x != null && Numbers != null) {
            Numbers.remove(x);
        }
        CheckRep();
    }

    public String toString() {
        return Numbers.toString();
    }
}
