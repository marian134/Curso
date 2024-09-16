package com.example.Cursos.repository;

import com.example.Cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso , Long> {

    List<Curso> findByNombreContaining(String nombre);
}
