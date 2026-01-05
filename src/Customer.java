public class Customer extends User {
    private String address;
    private String phone;

    // UML'deki: +Customer(username, password, phone)
    public Customer(String username, String password, String phone) {
        super(username, password);
        this.phone = phone;
    }

    // UML'deki: +updateAddress(address)
    public void updateAddress(String address) {
        this.address = address;
    }

    // UML'deki: +getAddress()
    public String getAddress() {
        return address;
    }
}
