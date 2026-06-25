public class CustomerRepositoryImpl
        implements CustomerRepository {

    @Override
    public String findCustomerById(int customerId) {

        return "Customer Found -> ID: "
                + customerId
                + ", Name: Rahul";
    }
}