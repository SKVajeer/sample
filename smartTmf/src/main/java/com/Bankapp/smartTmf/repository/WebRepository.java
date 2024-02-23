package com.Bankapp.smartTmf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bankapp.smartTmf.dto.Userdto;

public interface WebRepository extends JpaRepository<Userdto, Integer> {
	

}