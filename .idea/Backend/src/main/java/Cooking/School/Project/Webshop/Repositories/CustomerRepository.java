package Cooking.School.Project.Webshop.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Cooking.School.Project.Webshop.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);

    Customer findByCustomerID(int customerID);
}
