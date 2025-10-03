package com.example.demo_jogador.services;

import com.example.demo_jogador.models.Jogador;
import com.example.demo_jogador.repositories.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service //indica para o spring que é um componente do tipo Service
public class JogadorService {
    private JogadorRepository jogadorRepository; //atributo

    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }

    public Jogador createJogador(String nome, String sobrenome){
        Jogador novoJogador = new Jogador(); //preciso instanciar para criar um novo jogador
        novoJogador.setNome(nome);
        novoJogador.setSobrenome(sobrenome);
        novoJogador.setClube("Criciúma");
        jogadorRepository.save(novoJogador); //tem que ser antes do return, porque depois o metodo não executa mais nada
        return novoJogador;
    }

    public List<Jogador> getAllJogadores(){
        return jogadorRepository.findAll();//buscar todos os jogadores, ele já entende que são jogadores e trata-se de um metodo nativo do spring
    }

    public Jogador getJogadorEspecifico(List<Jogador> jogadores, UUID id){
        for (Jogador jogador : jogadores){
            if (jogador.getId().equals(id)){
                return jogador;
            }
        }
    }
}
