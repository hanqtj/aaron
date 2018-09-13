package com.aaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaron.model.ThreeD;

public interface AaronDao  extends JpaRepository<ThreeD, Integer>{

}
