package ml.ivinodev.customerservice.repository;

import ml.ivinodev.customerservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//annotation qui permet d'utiliser spring data rest
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
