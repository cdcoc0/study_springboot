package kirri.chop.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
//        app.addListeners(new SampleListener());
        app.run(args);

//        SpringApplication.run(Application.class, args);
    }
}
