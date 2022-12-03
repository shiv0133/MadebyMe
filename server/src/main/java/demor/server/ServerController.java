package demor.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @RequestMapping("/server")
    public String Server(){
        return "this is our response from our server side";
    }
}
