package springboot2025.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v3")
public class HomeControllerWithEntity {

  @GetMapping("/test1")
  public ResponseEntity<String> test1(){
    return ResponseEntity.ok()
      .contentType(MediaType.TEXT_PLAIN)
      .body("44");
  }

  @GetMapping("/test3")
  public ResponseEntity<String> test2(){
    return ResponseEntity.ok()
      .body("441");
  }
}


// RequestEntity Vs ResponseEntity