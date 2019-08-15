package web;

import models.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController // @Controller and @ResponseBody together
public class JSONController {
        @RequestMapping(method = GET, path = "/greeting")
        // MappingJackson2HttpMessageConverter will serialize the POJO into JSON
        public Person person(@RequestParam(value="name", defaultValue="Bob") String name) {
            return new Person(10, name);
        }
}
