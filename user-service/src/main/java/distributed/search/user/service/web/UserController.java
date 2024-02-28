package distributed.search.user.service.web;

import distributed.search.user.service.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    
    @GetMapping("/{id}")
    public User queryById() {
        return new User();
    }
}
