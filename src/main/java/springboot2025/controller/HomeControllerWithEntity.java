package springboot2025.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v3")
public class HomeControllerWithEntity {

  @GetMapping("/test1")
  public ResponseEntity<String> test1(){
    return ResponseEntity.ok()
      .contentType(MediaType.TEXT_PLAIN)
      .body("44");
  }
}


// RequestEntity Vs ResponseEntity