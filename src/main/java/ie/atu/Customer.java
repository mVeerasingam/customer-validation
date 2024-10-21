package ie.atu;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Document(collection = "customers")
public class Customer {
    @Id
    private String customerId;
    @NotBlank(message = "First Name Cannot be blank")
//    @Min(message = 2 ch)
    private String firstName;

    @NotBlank(message = "Last Name Cannot be blank")
    private String lastName;

    @Email
    private String email;

    private int phoneNumber;

    private String dateOfBirth;
}
