// This class specifies at listening to events aside from commands (e.g. messages, guild changes, member joins, etc.)
package com.svx.svixy.bot.listeners;

import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;


public class EventListener extends ListenerAdapter {

    // when a message is sent to a channel, checks its content, and if it matches with something, execute a method
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String received = event.getMessage().getContentRaw().toLowerCase();

        // check if svixy is mentioned
        if (received.contains("svixy")) {
            // Greetings
            if (received.contains("hi") || received.contains("sup") || received.contains("hello")) {
                EventAction.sendRandomGreeting(event);
            }
            // Curses
            else if (received.contains("fuck") || received.contains("shit") || received.contains("stupid")
                    || received.contains("bad")) {
                EventAction.sendCurseResponse(event, received);
            }
        }
    }
}
