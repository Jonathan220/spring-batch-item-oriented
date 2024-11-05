package br.com.jonathan.item_oriented.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type1;
    private String type2;
    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer spAttack;
    private Integer spDefense;
    private Integer speed;
    private Integer generation;
    private boolean lengendary;

    public Pokemon() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(Integer spAttack) {
        this.spAttack = spAttack;
    }

    public Integer getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(Integer spDefense) {
        this.spDefense = spDefense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
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
        return "Pokemon [id=" + id + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + ", hp=" + hp
                + ", attack=" + attack + ", defense=" + defense + ", spAttack=" + spAttack + ", spDefense=" + spDefense
                + ", speed=" + speed + ", generation=" + generation + ", lengendary=" + lengendary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Pokemon other = (Pokemon) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }    

}
