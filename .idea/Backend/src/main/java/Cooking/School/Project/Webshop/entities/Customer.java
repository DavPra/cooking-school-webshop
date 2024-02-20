package Cooking.School.Project.Webshop.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Table(name = "customers")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerSequence")
    @GenericGenerator(
            name = "customerSequence",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "customer_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    private Long customerID;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String address;

    private String city;

    private String postalCode;

    private String country;

    private String phoneNumber;



    public Customer(String firstName, String lastName, String email, String password, String address, String city, String postalCode, String country, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
}
