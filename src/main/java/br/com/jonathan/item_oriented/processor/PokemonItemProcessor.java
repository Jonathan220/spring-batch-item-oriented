package br.com.jonathan.item_oriented.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import br.com.jonathan.item_oriented.entities.Pokemon;
import br.com.jonathan.item_oriented.entities.dtos.PokemonDTO;

@Component
public class PokemonItemProcessor implements ItemProcessor<PokemonDTO, Pokemon> {

    @Override
    public Pokemon process(PokemonDTO item) throws Exception {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(item.getName());
        pokemon.setType1(item.getType1());
        pokemon.setType2(item.getType2());
        pokemon.setHp(Integer.parseInt(item.getHp()));
        pokemon.setAttack(item.getAttack() != null ? Integer.parseInt(item.getAttack()) : null);
        pokemon.setDefense(item.getDefense() != null ? Integer.parseInt(item.getDefense()) : null);
        pokemon.setSpAttack(item.getSpAttack() != null ? Integer.parseInt(item.getSpAttack()) : null);
        pokemon.setSpDefense(item.getSpDefense() != null ? Integer.parseInt(item.getSpDefense()) : null);
        pokemon.setSpeed(item.getSpeed() != null ? Integer.parseInt(item.getSpeed()) : null);
        pokemon.setGeneration(item.getGeneration() != null ? Integer.parseInt(item.getGeneration()) : null);
        pokemon.setLengendary(item.isLengendary());

        return pokemon;
    }

}
