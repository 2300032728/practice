package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
 @GetMapping("/")
 public String home() {
	 return "every one good evening";
 }
 @GetMapping("/shyamala")
 public String shyamala() {
	 return "im going to get good placement";
 }


}
