
import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstThreeMinimalNumbers {
    public static void main(String args[]) {
         List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        boolean allStartWithS = names.stream().allMatch(name -> name.startsWith("S"));
        System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allStartWithS);

        boolean anyStartWithS = names.stream().anyMatch(name -> name.startsWith("S"));
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anyStartWithS);

        /*
        ArrayList<Integer> listValues = new ArrayList<Integer> ();
        listValues.add(10);
        listValues.add(2);
        listValues.add(20);
        listValues.add(50);
        listValues.add(11);
        listValues.add(6);

        listValues.stream().sorted();
        System.out.println(listValues);
        listValues.stream().sorted().limit(3).forEach(System.out::println); 
        System.out.println(listValues);
        //listValues.stream().sorted().limit(3).forEach(m->SystemTray.out::println);*/



    }
}