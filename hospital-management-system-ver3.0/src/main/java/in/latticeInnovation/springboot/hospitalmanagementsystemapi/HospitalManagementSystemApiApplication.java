package in.latticeInnovation.springboot.hospitalmanagementsystemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"in.latticeInnovation.springboot.hospitalmanagementsystemapi"})
public class HospitalManagementSystemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemApiApplication.class, args);
	}

}
