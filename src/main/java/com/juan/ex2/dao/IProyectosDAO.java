package com.juan.ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex2.dto.Proyectos;

public interface IProyectosDAO extends JpaRepository<Proyectos, Integer> {

}
