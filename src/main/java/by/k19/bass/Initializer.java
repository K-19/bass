package by.k19.bass;

import by.k19.bass.model.Event;
import by.k19.bass.model.Group;
import by.k19.bass.model.GroupRepository;
import by.k19.bass.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
class Initializer implements CommandLineRunner {
    static Logger logger = LoggerFactory.getLogger(Initializer.class);

    private final GroupRepository repository;

    public Initializer(GroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        User user = User.builder().
                name("Sergey").
                email("sergeifilinovich01@gmail.com").
                phone("+375292784340").
                build();
        logger.debug("Объект создан: " + user);

        logger.debug("WHAT?");
    }
}
