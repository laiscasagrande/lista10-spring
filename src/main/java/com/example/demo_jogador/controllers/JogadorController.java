package com.example.demo_jogador.controllers;

import com.example.demo_jogador.models.Jogador;
import com.example.demo_jogador.services.JogadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogadores")//todas as rotas irão começar com barra jogador
public class JogadorController {
    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    public Jogador createJogador(@RequestBody Jogador jogador) { //indica que é para pegar no corpo
        return jogadorService.createJogador(jogador.getNome(), jogador.getSobrenome());
    }

    @GetMapping
    public List<Jogador> getAllJogadores(){
        return jogadorService.getAllJogadores();
    }
}
