package Optional;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        // Get the MemoryMXBean instance
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        // Get the total committed memory in bytes
        long totalCommittedMemory = memoryMXBean.getHeapMemoryUsage().getCommitted();

        // Get the total reserved memory in bytes
        long totalReservedMemory = memoryMXBean.getHeapMemoryUsage().getInit();

        // Get the total malloc memory in bytes
        Runtime runtime = Runtime.getRuntime();
        long totalMallocMemory = runtime.totalMemory();

        // Print the memory usage metrics
        System.out.println("Total Committed Memory: " + totalCommittedMemory + " bytes");
        System.out.println("Total Reserved Memory: " + totalReservedMemory + " bytes");
        System.out.println("Total Malloc Memory: " + totalMallocMemory + " bytes");
        Optional<String> s = Optional.of("Hello");
        System.out.println(s.map(String::toUpperCase));
        System.out.println(s.filter(s1 -> s1.equals("s")).orElse("Not found"));
    }
}
