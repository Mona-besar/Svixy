package com.svx.svixy.mysticsiege.service.game.gamemechanic;

import com.svx.svixy.mysticsiege.entity.AdvancedEntity;
import com.svx.svixy.mysticsiege.entity.BasicEntity;

public interface ISkill {
    public void castSkill(AdvancedEntity caster, BasicEntity target);
}
