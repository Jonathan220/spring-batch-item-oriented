package br.com.jonathan.item_oriented.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.item_oriented.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
