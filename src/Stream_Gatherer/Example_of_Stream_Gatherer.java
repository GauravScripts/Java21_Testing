package Stream_Gatherer;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class Example_of_Stream_Gatherer {
    public static void main(String[] args) {
        Stream<String> input = Stream.of("foo", "bar", "baz", "quux");

        // Custom gatherer to make distinct based on string length
        Collector<String, ?, Stream<String>> lengthDistinct =
                Collector.of(
                        () -> new int[256], // Initialize an array to track lengths
                        (arr, s) -> arr[s.length()]++, // Accumulate lengths
                        (arr1, arr2) -> { // Combine arrays
                            for (int i = 0; i < arr1.length; i++) {
                                arr1[i] += arr2[i];
                            }
                            return arr1;
                        },
                        arr -> Stream.of("foo", "bar", "baz", "quux")
                                .filter(s -> arr[s.length()]-- > 0)
                );

        Stream<String> result = input.gather(lengthDistinct);

        result.forEach(System.out::println);
    }
}
