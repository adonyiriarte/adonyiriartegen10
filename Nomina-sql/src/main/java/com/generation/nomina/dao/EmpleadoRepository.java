package com.generation.nomina.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.nomina.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
