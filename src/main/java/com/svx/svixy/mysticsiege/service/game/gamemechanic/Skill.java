package com.svx.svixy.mysticsiege.service.game.gamemechanic;

import com.svx.svixy.mysticsiege.entity.AdvancedEntity;
import com.svx.svixy.mysticsiege.entity.BasicEntity;

public class Skill {
    public static final int SUCCESS = 1;
    public static final int INVALID_TARGET = 0;

    public static int fireball(AdvancedEntity caster, BasicEntity target) {
        final int STAMINA_COST = 10;
        if (caster.isPartyMember() && target.isPartyMember()) {
            return INVALID_TARGET;
        }
        target.takeDamage(caster.getMagicalAttack(), caster.getElement());
        return SUCCESS;
    }

    public static int freeze(AdvancedEntity caster, BasicEntity target) {
        final int STAMINA_COST = 25;
        if (caster.isPartyMember() && target.isPartyMember()) {
            return INVALID_TARGET;
        }
        target.takeDamage((caster.getMagicalAttack() * 1.2), caster.getElement());
        target.setStatus(Status::frozen);
        return SUCCESS;
    }

    public static int earthWall(AdvancedEntity caster, BasicEntity target) {
        final int STAMINA_COST = 15;
        if (caster.isPartyMember() && !target.isPartyMember()) {
            return INVALID_TARGET;
        }
        target.setStatus(Status::reinforced);
        return SUCCESS;
    }
}
