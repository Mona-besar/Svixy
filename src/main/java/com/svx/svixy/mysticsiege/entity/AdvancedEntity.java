/*
The advanced entity class will have all the attributes of BasicEntity and skills
This class does not have the attributes of:
1. Classes with specific mechanics (bosses, party members)
 */
package com.svx.svixy.mysticsiege.entity;

import com.svx.svixy.mysticsiege.service.game.gamemechanic.ISkill;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.IStatus;

public class AdvancedEntity {
    // Fields
    private final BasicEntity basicEntity;
    private ISkill firstSkill;
    private ISkill secondSkill;
    private ISkill ultimateSkill;


    // Constructor
    public AdvancedEntity(BasicEntity basicEntity, ISkill firstSkill, ISkill secondSkill, ISkill ultimateSkill) {
        this.basicEntity = basicEntity;
        this.firstSkill = firstSkill;
        this.secondSkill = secondSkill;
        this.ultimateSkill = ultimateSkill;
    }


    // Methods
    public void basicAttack (BasicEntity target) {
        target.takeDamage(basicEntity.getPhysicalAttack());
    }

    public void firstSkill (BasicEntity target) {
        firstSkill.castSkill(this, target);
    }

    public void secondSkill (BasicEntity target) {
        secondSkill.castSkill(this, target);
    }

    public void ultimateSkill (BasicEntity target) {
        ultimateSkill.castSkill(this, target);
    }


    // Getter Setter
    public BasicEntity getBasicEntity() {
        return basicEntity;
    }
    public ISkill getFirstSkill() {
        return firstSkill;
    }

    public void setFirstSkill(ISkill firstSkill) {
        this.firstSkill = firstSkill;
    }

    public ISkill getSecondSkill() {
        return secondSkill;
    }

    public void setSecondSkill(ISkill secondSkill) {
        this.secondSkill = secondSkill;
    }

    public ISkill getUltimateSkill() {
        return ultimateSkill;
    }

    public void setUltimateSkill(ISkill ultimateSkill) {
        this.ultimateSkill = ultimateSkill;
    }

    public void takeDamage(double damage) {
        getBasicEntity().takeDamage(damage);
    }

    public void takeDamage(double damage, String element) {
        getBasicEntity().takeDamage(damage, element);
    }

    public boolean isPartyMember() {
        return getBasicEntity().isPartyMember();
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