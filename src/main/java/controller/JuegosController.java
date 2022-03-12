package controller;

import models.Juegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.JuegosRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class JuegosController {
    @Autowired
    private JuegosRepository repository;

    @GetMapping("/juegos")
    public List<Juegos> listarTodosLosJuegos(){
        return repository.findAll();
    }
}
