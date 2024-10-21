package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Customer findById(String id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID " + id + " Not Found"));
    }

    public void deleteCustomer(String id){
        customerRepository.deleteById(id);
    }
}
