package ie.atu;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cusomters")
public class Customer {
    @Id
    private String id;
    @NotBlank(message = "First Name Cannot be blank")
//    @Min(message = 2 ch)
    private String firstName;

    @NotBlank(message = "Last Name Cannot be blank")
    private String lastName;

    private int phoneNumber;

    private String dateOfBirth;
}
