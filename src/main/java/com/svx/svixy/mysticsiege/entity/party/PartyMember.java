/*
This is the class for party member objects
This class has some unique mechanics not owned by other classes, including:
1. Stamina
2. Levels
3. Gear
 */
package com.svx.svixy.mysticsiege.entity.party;

import com.svx.svixy.mysticsiege.entity.AdvancedEntity;
import com.svx.svixy.mysticsiege.entity.BasicEntity;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.ISkill;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.IStatus;

public class PartyMember {
    // Fields
    private final AdvancedEntity advancedEntity;
    private int stamina;
    private int staminaRegeneration;


    // Constructor
    public PartyMember(AdvancedEntity advancedEntity, int stamina, int staminaRegeneration) {
        this.advancedEntity = advancedEntity;
        this.stamina = stamina;
        this.staminaRegeneration = staminaRegeneration;
    }


    // Methods
    public boolean isPartyMember() {
        return true;
    }


    // Getter Setters
    public AdvancedEntity getAdvancedEntity() {
        return advancedEntity;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStaminaRegeneration() {
        return staminaRegeneration;
    }

    public void setStaminaRegeneration(int staminaRegeneration) {
        this.staminaRegeneration = staminaRegeneration;
    }

    public void basicAttack(BasicEntity target) {
        getAdvancedEntity().basicAttack(target);
    }

    public void firstSkill(BasicEntity target) {
        getAdvancedEntity().firstSkill(target);
    }

    public void secondSkill(BasicEntity target) {
        getAdvancedEntity().secondSkill(target);
    }

    public void ultimateSkill(BasicEntity target) {
        getAdvancedEntity().ultimateSkill(target);
    }

    public BasicEntity getBasicEntity() {
        return getAdvancedEntity().getBasicEntity();
    }

    public ISkill getFirstSkill() {
        return getAdvancedEntity().getFirstSkill();
    }

    public void setFirstSkill(ISkill firstSkill) {
        getAdvancedEntity().setFirstSkill(firstSkill);
    }

    public ISkill getSecondSkill() {
        return getAdvancedEntity().getSecondSkill();
    }

    public void setSecondSkill(ISkill secondSkill) {
        getAdvancedEntity().setSecondSkill(secondSkill);
    }

    public ISkill getUltimateSkill() {
        return getAdvancedEntity().getUltimateSkill();
    }

    public void setUltimateSkill(ISkill ultimateSkill) {
        getAdvancedEntity().setUltimateSkill(ultimateSkill);
    }

    public void takeDamage(double damage) {
        getBasicEntity().takeDamage(damage);
    }

    public void takeDamage(double damage, String element) {
        getBasicEntity().takeDamage(damage, element);
    }

    public String getName() {
        return getBasicEntity().getName();
    }

    public String getElement() {
        return getBasicEntity().getElement();
    }

    public void setElement(String element) {
        getBasicEntity().setElement(element);
    }

    public int getHp() {
        return getBasicEntity().getHp();
    }

    public void setHp(int hp) {
        getBasicEntity().setHp(hp);
    }

    public int getDefense() {
        return getBasicEntity().getDefense();
    }

    public void setDefense(int defense) {
        getBasicEntity().setDefense(defense);
    }

    public int getResistance() {
        return getBasicEntity().getResistance();
    }

    public void setResistance(int resistance) {
        getBasicEntity().setResistance(resistance);
    }

    public int getPhysicalAttack() {
        return getBasicEntity().getPhysicalAttack();
    }

    public void setPhysicalAttack(int physicalAttack) {
        getBasicEntity().setPhysicalAttack(physicalAttack);
    }

    public int getMagicalAttack() {
        return getBasicEntity().getMagicalAttack();
    }

    public void setMagicalAttack(int magicalAttack) {
        getBasicEntity().setMagicalAttack(magicalAttack);
    }

    public IStatus getStatus() {
        return getBasicEntity().getStatus();
    }

    public void setStatus(IStatus status) {
        getBasicEntity().setStatus(status);
    }
}