/*
The basic entity class will have all the necessary attributes owned by every entity
This class does not have the attributes of:
1. Classes with skills (party members, high tier enemies, bosses)
2. Classes with specific mechanics (bosses [true damage reduction], party members [stamina])
3. Min and max fields are used for limiting the randomness of the attributes
 */
package com.svx.svixy.mysticsiege.entity;

import com.svx.svixy.mysticsiege.service.game.gamemechanic.Element;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.IStatus;

import java.util.Map;

public class BasicEntity {
    // Fields
    private final String name;
    private String element;
    private int hp;
    private int defense;
    private int resistance;
    private int physicalAttack;
    private int magicalAttack;
    private IStatus status = null;


    // Constructor
    public BasicEntity(String name, String element,
                       int hp, int defense, int resistance, int physicalAttack, int magicalAttack) {
        this.name = name;
        this.element = element;
        this.hp = hp;
        this.defense = defense;
        this.resistance = resistance;
        this.physicalAttack = physicalAttack;
        this.magicalAttack = magicalAttack;
    }


    // Methods
    // Takes physical damage minus this entity's defense
    public void takeDamage(double damage) {
        hp -= (int) Math.round(damage - defense);
    }

    // Takes magical damage times elemental affinity times resistance in decimal
    public void takeDamage(double damage, String element) {
        hp -= (int) Math.round(((damage * getElementalAffinity(element)) * (1 - (resistance / 100.0))));
    }

    // Returns damage multiplier based on elemental affinity in "Element" class
    private double getElementalAffinity(String element) {
        Map<String, Double> elementalAffinity = Element.AFFINITY_MAP.get(element);
        if (elementalAffinity != null && elementalAffinity.containsKey(this.element)) {
            return elementalAffinity.get(this.element);
        }
        return 1.0;
    }

    public boolean isPartyMember() {
        return false;
    }


    // Getter Setter
    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public int getMagicalAttack() {
        return magicalAttack;
    }

    public void setMagicalAttack(int magicalAttack) {
        this.magicalAttack = magicalAttack;
    }

    public IStatus getStatus() {
        return status;
    }

    public void setStatus(IStatus status) {
        this.status = status;
    }
}
