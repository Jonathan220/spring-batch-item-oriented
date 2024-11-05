package br.com.jonathan.item_oriented.entities.dtos;

public class PokemonDTO {
    
    private String numero;
    private String name;
    private String type1;
    private String type2;
    private String hp;
    private String attack;
    private String defense;
    private String spAttack;
    private String spDefense;
    private String speed;
    private String generation;
    private boolean lengendary;

    public PokemonDTO(){}

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(String spAttack) {
        this.spAttack = spAttack;
    }

    public String getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(String spDefense) {
        this.spDefense = spDefense;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public boolean isLengendary() {
        return lengendary;
    }

    public void setLengendary(boolean lengendary) {
        this.lengendary = lengendary;
    }

    
    @Override
    public String toString() {
        return "PokemonDTO [name=" + name + ", type1=" + type1 + ", type2=" + type2 + ", hp=" + hp + ", attack="
                + attack + ", defense=" + defense + ", spAttack=" + spAttack + ", spDefense=" + spDefense + ", speed="
                + speed + ", generation=" + generation + ", lengendary=" + lengendary + "]";
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PokemonDTO other = (PokemonDTO) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }



    public String getNumero() {
        return numero;
    }



    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
