package com.svx.svixy.mysticsiege.service.game.gamemechanic;

import com.svx.svixy.mysticsiege.entity.BasicEntity;

public class Status {
    public static void reinforced(BasicEntity caster, BasicEntity target) {
        // 3 turns, + 15 defense, if reapplied : turn becomes 3 again
    }

    public static void coatedByMana(BasicEntity caster, BasicEntity target) {
        // 3 turns, + 15 resistance, if reapplied : turn becomes 3 again
    }

    public static void frozen(BasicEntity caster, BasicEntity target) {
        // 2 turns, unable to do action, cannot be reapplied
    }
}
