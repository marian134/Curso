package com.example.Cursos.controller;

import com.example.Cursos.model.Curso;
import com.example.Cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }
    @GetMapping("/{id}")
    public Curso obtenerCurso(@PathVariable long id){
        return cursoService.obtenerCursoPorId(id);
    }
    @PostMapping
    public Curso agregarCurso(@RequestBody Curso curso){
        return cursoService.agregarCurso(curso);
    }
    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable long id){
        cursoService.eliminarCurso(id);
    }
    @GetMapping("/buscar")
    public List<Curso> buscarCursos(@RequestParam String nombre){
        return cursoService.buscarCursos(nombre);
    }
}
