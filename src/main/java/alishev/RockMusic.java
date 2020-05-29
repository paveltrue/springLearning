package alishev;

import org.springframework.stereotype.Component;

import javax.annotation.*;


@Component
public class RockMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my Rock initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my Rock destroy");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

}
