package com.juan.ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex2.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository <Cientificos, Integer> {

}
