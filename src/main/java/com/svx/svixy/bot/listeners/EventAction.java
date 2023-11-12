package com.svx.svixy.bot.listeners;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Random;

public class EventAction {
    // Generate random greeting
    static void sendRandomGreeting(MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        Random random = new Random();
        String[] greetingsStart = {
                "Hello", "Hi", "Greetings"
        };
        String[] greetingsEnd = {
                "What can I help you with?", "How can I help you with?", "How can I assist you?"
        };
        String greeting = greetingsStart[random.nextInt(greetingsStart.length)] + " " + event.getAuthor().getAsMention()
                + ", " + greetingsEnd[random.nextInt(greetingsEnd.length)];
        channel.sendMessage(greeting).queue();
    }

    static void sendCurseResponse(MessageReceivedEvent event, String received) {
        User user = event.getAuthor();
        MessageChannel channel = event.getChannel();
        Random random = new Random();

        if (received.contains("fuck")) {
            String[] fuckResponse = {
                "Where and when?", "Is that a promise or a threat?", "You can't afford me",
                        "Rather not, your sister on the other hand.."
            };
            channel.sendMessage(fuckResponse[random.nextInt(fuckResponse.length)]).queue();
            return;
        }

        String[] ipAddress = {
                "33.222.59.211", "126.74.19.78", "132.183.254.98", "113.99.73.96", "81.186.63.162", "171.57.187.181",
                "60.146.245.131", "171.60.2.128", "116.62.193.203", "129.203.186.179"
        };
        int choice = random.nextInt(3);
        switch (choice) {
            case 0 -> user.openPrivateChannel().queue(privateChannel -> privateChannel
                    .sendMessage("I know where you live lil nigga").queue());
            case 1 -> user.openPrivateChannel().queue(privateChannel -> privateChannel
                    .sendMessage("Let me touch you lil nigga").queue());
            case 2 -> channel.sendMessage(ipAddress[random.nextInt(ipAddress.length)]).queue();
        }
    }
}
