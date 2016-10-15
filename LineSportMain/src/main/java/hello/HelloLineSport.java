package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Biedek91 on 2016-10-15.
 */

@RestController
public class HelloLineSport {
    @RequestMapping("/")
    public String index() {
        return " Line Sport przeprasza najmocniej za niedostępność trwają prace techniczne nad budową strony";
    }
}
