package ml.ivinodev.customerservice;

import ml.ivinodev.customerservice.models.Customer;
import ml.ivinodev.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.saveAll(
                    List.of(
                            Customer.builder().name("Ivy").email("ivino@orangemali.com").build(),
                            Customer.builder().name("Kaloga").email("fkaloga@orangemali.com").build(),
                            Customer.builder().name("Nene").email("nenes@orangemali.com").build()
                    )
            );
            customerRepository.findAll().forEach(System.out::println);
        };
    }

}
