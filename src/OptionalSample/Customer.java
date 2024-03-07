package OptionalSample;

public class Customer {
    int custID;
    String custName;
    String custAddress;
    public Customer(int custID, String custName, String custAddress) {
        this.custID = custID;
        this.custName = custName;
        this.custAddress = custAddress;
    }
    public int getCustID() {
        return custID;
    }
    public void setCustID(int custID) {
        this.custID = custID;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustAddress() {
        return custAddress;
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    public String toString() {
        return STR."Customer [custID=\{custID}, custName=\{custName}, custAddress=\{custAddress}]";
    }

}
