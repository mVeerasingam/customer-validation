package ie.atu;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Document(collection = "customers")
public class Customer {
    @Id
    private String customerId;

    @NotBlank(message = "First Name Cannot be blank")
    @Length(min = 2, max = 200)
    private String firstName;

    @NotBlank(message = "Last Name Cannot be blank")
    @Length(min = 2, max = 200)
    private String lastName;

    @Email
    private String email;

    private int phoneNumber;

    private String dateOfBirth;
}
