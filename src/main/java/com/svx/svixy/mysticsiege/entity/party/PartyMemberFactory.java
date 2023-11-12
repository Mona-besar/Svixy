/*
This class specifies in creating characters.
Characters have pre-determined attribute and skills.
 */
package com.svx.svixy.mysticsiege.entity.party;

import com.svx.svixy.mysticsiege.entity.AdvancedEntity;
import com.svx.svixy.mysticsiege.entity.BasicEntity;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.Element;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.ISkill;
import com.svx.svixy.mysticsiege.service.game.gamemechanic.Skill;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class PartyMemberFactory {
    public static final String[] characterList = {"Rudy", ""};

    @NotNull
    @Contract("_, _, _, _, _, _, _, _, _, _, _, _ -> new")
    public static PartyMember createPartyMember(String name, String element,
                                                int hp, int defense, int resistance,
                                                int physicalAttack, int magicalAttack,
                                                ISkill firstSkill, ISkill secondSkill, ISkill ultimateSkill,
                                                int stamina, int staminaRegeneration) {
        return new PartyMember(
                new AdvancedEntity(
                        new BasicEntity(
                                name, element,
                                hp, defense, resistance, physicalAttack, magicalAttack
                        ), firstSkill, secondSkill, ultimateSkill
                ), stamina, staminaRegeneration
        );
    }

    @NotNull
    @Contract(" -> new")
    public static PartyMember createRudy() {
        return createPartyMember("Rudy", Element.WIND,
                500, 15, 5, 50, 20,
                null, null, null,
                20, 1);
    }
    @NotNull
    @Contract(" -> new")
    public static PartyMember createElysia() {
        return createPartyMember("Elysia", Element.WATER,
                320, 5, 10, 10, 70,
                null, null, null,
                18, 1);
    }
    @NotNull
    @Contract(" -> new")
    public static PartyMember createMildred() {
        return createPartyMember("Mildred", Element.EARTH,
                750, 30, 5, 20, 10,
                Skill::earthWall, null, null,
                25, 1);
    }
}
