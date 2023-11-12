package com.svx.svixy.bot;

import com.svx.svixy.bot.commands.CommandManager;
import com.svx.svixy.bot.listeners.EventListener;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.exceptions.InvalidTokenException;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

public class Svixy {
    public Svixy() throws InvalidTokenException { // Loads token from .env file and launch bot
        // Initiation
        Dotenv config = Dotenv.configure().ignoreIfMissing().load();
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(config.get("TOKEN"));
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES, GatewayIntent.MESSAGE_CONTENT);
        ShardManager shardManager = builder.build();

        // Status
        builder.setStatus(OnlineStatus.IDLE);

        // Listener
        shardManager.addEventListener(new EventListener(), new CommandManager());
    }

    public static void main(String[] args) {
        try {
            new Svixy();
        } catch (InvalidTokenException e) {
            System.out.println("ERROR: Token is invalid");
        }
    }
}
