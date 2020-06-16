package alishev;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("alishev")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
