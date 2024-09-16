package com.example.Cursos.service;

import com.example.Cursos.model.Curso;
import com.example.Cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
    public Curso obtenerCursoPorId(Long id){
        return cursoRepository.findById(id).orElse(null);
    }
    public Curso agregarCurso(Curso curso){
        return cursoRepository.save(curso);
    }
    public void eliminarCurso(Long id){
        cursoRepository.deleteById(id);
    }
    public List<Curso> buscarCursos(String nombre){
        return cursoRepository.findByNombreContaining(nombre);
    }
}
