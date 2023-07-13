package ru.dis.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Log4j
public class TelegramBot extends TelegramLongPollingBot {
    @Value("${bot.name}")
    private String botName;
    @Value("${bot.token}")
    private String botToken;

    @Override
    public String getBotUsername() {
        return botName;//"TestBot_1006_bot";
    }

    @Override
    public String getBotToken() {
        return botToken;//"6287952989:AAGFSD7Xa3WGnrUH6sgrAGXPYo6UPaMapoo";
    }

    @Override
    public void onUpdateReceived(Update update) {
//        log(update.getMessage().getText());
        System.out.println(update.getMessage());
        System.out.println(update.getUpdateId());
//tttttt
    }
    /*
    TestBot_1006_bot
    * Done! Congratulations on your new bot. You will find it at t.me/TestBot_1006_bot. You can now add a description, about section and profile picture for your bot, see /help for a list of commands. By the way, when you've finished creating your cool bot, ping our Bot Support if you want a better username for it. Just make sure the bot is fully operational before you do this.

Use this token to access the HTTP API:
6287952989:AAGFSD7Xa3WGnrUH6sgrAGXPYo6UPaMapoo
Keep your token secure and store it safely, it can be used by anyone to control your bot.

For a description of the Bot API, see this page: https://core.telegram.org/bots/api*/
}
