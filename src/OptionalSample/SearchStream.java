package OptionalSample;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class SearchStream extends Customer {
    public SearchStream(int custID, String custName, String custAddress) {
        super(custID, custName, custAddress);
    }

    public static void main(String[] args) {
        List<Customer> customerList = List.of(
                new Customer(101, "John", "123 Main St"),
                new Customer(102, "Jane", "124 Main St"),
                new Customer(103, "Joe", "125 Main St")
        );
        SearchStream search = new SearchStream(101, "John", "123 Main St");
        search.customerNameByID(customerList, 102);
        HashMap<Integer, String> map = new HashMap<>();
        Queue<String> queue = null;
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    }

    void customerNameByID(List<Customer> customerList, int custid){
//        Optional<Customer> opt = customerList.stream().filter(c -> c.getCustID() == custid).reduce();
//        opt.ifPresent(c -> System.out.println(c.getCustName()));
    }
}
