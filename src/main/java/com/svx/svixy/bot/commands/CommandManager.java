package com.svx.svixy.bot.commands;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandData;
import org.jetbrains.annotations.NotNull;


public class CommandManager extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        String command = event.getName();
        if (event.getGuild() == null) {
            event.reply("Commands in direct messages are not supported yet").queue();
            return;
        }
        switch (command) {
            case "sum" -> CommandsList.sum(event);
            case "ping" -> CommandsList.ping(event);
            case "mysticsiege" -> CommandsList.mysticSiege(event);
            default -> event.reply("That command is not supported yet :(").setEphemeral(true).queue();
        }
    }

    @Override
    public void onGuildReady(@NotNull GuildReadyEvent event) {
        event.getGuild().updateCommands().addCommands(

                // Simple sum 2 number command for testing
                Commands.slash("sum", "Sums two number")
                        .addOptions(new OptionData(OptionType.INTEGER, "x", "First number")
                                .setRequired(true))
                        .addOptions(new OptionData(OptionType.INTEGER, "y", "Second number")
                                .setRequired(true)),

                // Simple ping command (ping is abnormally high?)
                Commands.slash("ping", "Outputs latency between discord and bot server"),

                // Mystic Siege game
                Commands.slash("mysticsiege", "Turn based RPG game")
                        .addSubcommands(
                                new SubcommandData("demo", "Try the demo battle"),
                                new SubcommandData("profile", "Open your Mystic Siege account profile")
                        )
        ).queue();
    }
}
