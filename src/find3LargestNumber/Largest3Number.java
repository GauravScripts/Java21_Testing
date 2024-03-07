package find3LargestNumber;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Largest3Number {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,3,4,52,2,4,2);
        Set<Integer> largest3Number =  number.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                        .collect(Collectors.toSet());
        System.out.println(largest3Number);
    }
}
