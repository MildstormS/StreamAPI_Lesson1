import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Without StreamAPI:");
        List<Integer> intList = Arrays.asList(1,2,5,16,-1,-2,0,32,3,5,8,23,4);
        Collections.sort(intList);
        for (int i : intList) {
            if (i > 0 && i % 2 == 0) System.out.println(i);
        }
    }
}