package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(String customerId){
        return customerRepository.findById(customerId);
    }

    public  Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findById(String customerId){
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("ID " + customerId + " Not Found"));
    }

    public void deleteCustomer(String customerId){
        findById(customerId);
        customerRepository.deleteById(customerId);
    }
}
