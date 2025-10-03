package com.example.demo_jogador.repositories;

import com.example.demo_jogador.models.Jogador;
import com.example.demo_jogador.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, UUID> {
}
