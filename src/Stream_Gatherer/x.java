package Stream_Gatherer;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MaxGatherer implements Gatherer<Integer, Integer, Integer> {

    @Override
    public Supplier<Integer> supplier() {
        return () -> Integer.MIN_VALUE; // Initial state: minimum possible integer
    }

    @Override
    public BiConsumer<Integer, Integer> accumulator() {
        return (state, element) -> state = Math.max(state, element);
    }

    @Override
    public Function<Integer, Integer> finisher() {
        return IdentityFunction.INSTANCE; // Identity function to simply return the final state
    }
}