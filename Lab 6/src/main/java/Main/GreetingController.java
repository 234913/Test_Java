package Main;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    CountService countService;
    public GreetingController(CountService countService) {
        this.countService = countService;
    }

    @RequestMapping("/bye")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name,
                             @RequestParam(value = "age",defaultValue = "world") String age) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name), String.format(age),String.format(plec(name)));
    }
    @RequestMapping("/hi")
    public Greeting hi(@RequestParam(value = "name", defaultValue = "World") String name,
                       @RequestParam(value = "age",defaultValue = "world") String age) {

        return new Greeting(counter.incrementAndGet(), String.format(template, name), String.format(age),String.format(plec(name)));
    }

    public String plec (String name){
        char[] namearray = name.toCharArray();
        int i = namearray.length;
        String plec;
        if (namearray[i-1] == 'a')
            return  plec = "kobieta";
        else
           return  plec = "mezczyzna";
    }
}
