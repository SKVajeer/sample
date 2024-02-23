package com.Bankapp.smartTmf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bankapp.smartTmf.dto.Userdto;
import com.Bankapp.smartTmf.services.WebService;

@RestController
@RequestMapping("/App")
public class WebController {
   @Autowired
   private  WebService webService;
  
   
   @PostMapping("/User")
   public Userdto createUser(@RequestBody Userdto User) {
   	return webService.createUser(User);
   }
}
