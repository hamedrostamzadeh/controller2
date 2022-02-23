package poolsoft.controller2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import poolsoft.model.M1;

@SpringBootApplication
public class Controller2Application {

    public static void main(String[] args) {
        M1 m = new M1();
        SpringApplication.run(Controller2Application.class, args);
    }

}
