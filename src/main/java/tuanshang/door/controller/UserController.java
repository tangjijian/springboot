package tuanshang.door.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tuanshang.bean.Person;
import tuanshang.bean.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

//    @Autowired
//    private User user;
    @GetMapping("/user/id/{id}/name/{username}")
    public Map<String, Object> getUser(
                                       @PathVariable("username") String name,
                                       @RequestParam Map<String,String> params,
                                       @PathVariable("id") Integer id,
                                       @CookieValue("_ga") String ga){
        HashMap<String, Object> map = new HashMap<>();
//        map.put("name", name);
//        map.put("id", id);
//        map.put("userAgent", userAgent);
//        map.put("headers", header);
        System.out.println(params);
        map.put("params", name);
        map.put("id", id);
        map.put("ga", ga);
        return map;
    }


    @PostMapping("/user")
    public String postUser(){
        return "post user";
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        return "delete user";
    }
    @PutMapping("/user")
    public String putUser(){
        return "put user";
    }

    @RequestMapping("/setCookie")
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("_ga","hello");
        cookie.setMaxAge(1200);
        response.addCookie(cookie);
        return  "ok";
    }

    @RequestMapping("/goto")
    public String touser( HttpServletRequest request){
        request.setAttribute("hello", "world");

        return "forward:/success";
    }
    @RequestMapping("/success")
    @ResponseBody
    public Map<String,Object> success( HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("hello", request.getAttribute("hello"));

        return map;
    }
    @ResponseBody
    @RequestMapping("/user/person")
    public Person person(){

        Person person = new Person();
        person.setName("张三");
        person.setAge(18);
        person.setBirth(new Date());

        return person;
    }
}
