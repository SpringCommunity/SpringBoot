package springcommunity.demo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorControllerImpl implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "This is error page but don't worry, it means your project's working correctly";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
