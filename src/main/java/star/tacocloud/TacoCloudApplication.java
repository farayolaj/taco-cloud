package star.tacocloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import star.tacocloud.data.UserRepository;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login");
    }

    @Bean
    @Profile("!prod")
    public CommandLineRunner runner(UserRepository userRepo, PasswordEncoder passwordEncoder) {
        return args -> userRepo.save(new User(
                "farayolaj",
                passwordEncoder.encode("password"),
                "Joshua Farayola",
                "Farayola Street",
                "Ogbomoso",
                "Oyo",
                "210252",
                "08109884061"
        ));
    }
}
