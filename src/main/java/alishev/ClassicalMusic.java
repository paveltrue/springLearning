package alishev;

import org.springframework.stereotype.Component;

import javax.annotation.*;


@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my Classical initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my Classical destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
