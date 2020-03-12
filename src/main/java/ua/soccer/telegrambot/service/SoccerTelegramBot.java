package ua.soccer.telegrambot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Component
public class SoccerTelegramBot extends TelegramLongPollingBot {
    @Value("${app.username}")
    private String userName;

    @Value("${app.token}")
    private String token;

    @Override
    public void onUpdateReceived(Update update) {
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {

    }

    @Override
    public String getBotUsername() {
        return userName;
    }

    @Override
    public String getBotToken() {
        return token;
    }
}
