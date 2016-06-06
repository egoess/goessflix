package net.apoplectic.goessflix.hello;

import net.apoplectic.goessflix.domain.Greeting;
import net.apoplectic.goessflix.domain.Person;
import net.apoplectic.goessflix.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@EnableAutoConfiguration
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private PersonRepository repo;

    @RequestMapping(method = GET, value = "/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(method = POST, value = "/addperson")
    public String addPerson(@RequestParam(value = "fname") String firstName,
                            @RequestParam(value = "lname") String lastName) {

        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            Person newPeeps = new Person();
            newPeeps.setFirstName(firstName);
            newPeeps.setLastName(lastName);
            repo.save(newPeeps);

            return "newPeep saved!";
        }

        return "nope";
    }

    @RequestMapping(method = GET, value = "/search")
    public Person lastNameSearch(@RequestParam(value = "lname") String lastName) {

        List<Person> results = repo.findByLastName(lastName);
        return results.get(0);
        
    }
}