package springboot2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v2")
public class HomeControllerv2 {

    @GetMapping("/number4")
    public Map<String, Integer> number4() {
        System.out.println("Hitting /4121");
        return Map.of("number", 4121);
    }


  @GetMapping("/number4a")
  public Map<String, Object> number4a() {
    System.out.println("Hitting /4121");
    return Map.of(
      "number", 4121,
      "controller","HomeController2",
      "timestamp",System.currentTimeMillis()
    );
  }

  // Returns JSON number - primitive int
  @GetMapping("/number1")
  public int number1() {
    return 11144;  // Returns: 44 (application/json)
  }

  // Returns JSON number - wrapper Integer
  @GetMapping("/number2")
  public Integer number2() {
    return 4453535;  // Returns: 44 (application/json)
  }


    @GetMapping("/number2a")
    public Map<String, Integer> numberMap() {
        return Map.of("number", 33);
    }

    @GetMapping(value = "/number3", produces = "application/json")
    public Integer number3() {
        return 44;
    }

}
