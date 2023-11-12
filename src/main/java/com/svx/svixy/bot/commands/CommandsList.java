package com.svx.svixy.bot.commands;

import com.svx.svixy.mysticsiege.service.game.MysticSiegeDemo;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class CommandsList extends ListenerAdapter {
    public static void sum(SlashCommandInteractionEvent event) {
        int x = Objects.requireNonNull(event.getOption("x")).getAsInt();
        int y = Objects.requireNonNull(event.getOption("y")).getAsInt();
        String message = Integer.toString(x + y);
        event.reply(message).queue();
    }

    public static void ping(SlashCommandInteractionEvent event) {
        long ping = System.currentTimeMillis() - event.getTimeCreated().toInstant().toEpochMilli();
        event.reply("pong! " + (ping / 10) + "ms").queue();
    }

    public static void mysticSiege(SlashCommandInteractionEvent event) {
        String subcommand = event.getSubcommandName();
        if (subcommand == null) {
            event.reply("Invalid command").setEphemeral(true).queue();
            return;
        }
        switch (subcommand) {
            default -> event.reply("That command is not supported yet :(").setEphemeral(true).queue();
        }

    }
}
