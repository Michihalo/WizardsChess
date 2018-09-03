package at.wizardschess.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
@RequestMapping(produces = "application/json")
public class MyTestController {

    private static final String template = "Hello, %s!";

    @RequestMapping(value = "/chess", method = RequestMethod.PUT)
    public String chessPut(@RequestParam("old-x") int oldXPosition, @RequestParam("old-y") int oldYPosition,
                           @RequestParam("new-x") int newXPosition, @RequestParam("new-y") int newYPosition) {
        return MessageFormat.format("PUT: Old: {0}, {1} - New: {2}, {3}", oldXPosition, oldYPosition, newXPosition, newYPosition);
    }

    @RequestMapping(value = "/chess", method = RequestMethod.GET)
    public String chessGet() {
        return "get";
    }
}