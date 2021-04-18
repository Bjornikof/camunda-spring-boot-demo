package com.example.workflow;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class controller {

    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    @PostMapping("/message")
    public model createMessage(@RequestBody model model) {
        logger.info("-------Message Creator Initialized-------");
        model m = new model();
        m.setMessage(model.getMessage());
        m.setName(model.getName());
        logger.info("Message created --> "+m.toString());
        return m;
    }
}
