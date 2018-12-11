package club.aiit.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 15:39
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is a message";
    }
}
