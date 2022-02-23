package poolsoft.controller2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import poolsoft.model.M;

@SpringBootApplication
public class Controller2Application {

    public static void main(String[] args) {
        M m = new M();
        SpringApplication.run(Controller2Application.class, args);
    }

}
