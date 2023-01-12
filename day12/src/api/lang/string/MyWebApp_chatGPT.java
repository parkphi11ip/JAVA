//package api.lang.string;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@RestController
//public class MyWebApp_chatGPT {
//
//    @GetMapping("/")
//    public String home() {
//        return "Welcome to My Web App!";
//    }
//
//    @GetMapping("/about")
//    public String about() {
//        return "This is an example web application built with Spring Framework";
//    }
//
//    @GetMapping("/contact")
//    public String contact() {
//        return "Contact us at example@email.com";
//    }
//    
//    @GetMapping("/user/{id}")
//    public String user(@PathVariable int id) {
//        return "User with id: " + id;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(MyWebApp.class, args);
//    }
//}
//
