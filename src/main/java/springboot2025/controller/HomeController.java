package springboot2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class HomeController {

  @GetMapping("/number4")
  public Map<String, Integer> number4() {
    System.out.println("Hitting /number4");
    return Map.of("number", 412);
  }


  @GetMapping("/number4a")
  public Map<String, Integer> number4a() {
    System.out.println("Hitting /number4");
    return Map.of("number", 412);
  }

  @ResponseBody
  @GetMapping(value = "/number1", produces = "text/plain")
  public int number1() {
    return 44;
  }
// If you want to return number, Then you need to change Spring will return Content-Type: text/plain.

  @ResponseBody
  @GetMapping(value = "/number2")
  public Integer number2() {
    return 44;
  }
  @GetMapping("/number2a")
  @ResponseBody
  public Map<String,Integer> numberMap(){
    return Map.of("number",33);
  }


  @ResponseBody
  @GetMapping(value = "/number3", produces = "application/json")
  public Integer number3() {
    return 44;
  }

}