package com.Bankapp.smartTmf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bankapp.smartTmf.dto.Userdto;
import com.Bankapp.smartTmf.repository.WebRepository;

@Service
public class WebService {
	 @Autowired
	private  WebRepository webRepository;
	
   

	public Userdto createUser(Userdto user) {
		
		return webRepository.save(user);
	}
}