package org.example;

import org.example.model.communication.server.HTTPServer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.model.conversation.Conversation;
import org.example.model.conversation.Message;
import org.example.model.conversation.User;
import org.example.services.SessionService;
import org.example.services.StorageService;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
////        new HTTPServer(8001);
//        Dotenv dotenv = Dotenv.configure().load();
//        // TODO: make it work on windows too ( / vs \ )
//        // Get the directory where data will be stored, either configured on the .env or tmp by default
//        String dataDirectory = dotenv.get("SAVES_DIR", System.getProperty("java.io.tmpdir")) + "/.clavardage";
//
//        StorageService storage = StorageService.StorageService(dataDirectory);
//        ArrayList<Message> ms = new ArrayList<>();
//        ms.add(new Message(new User("Louis"), "coucou"));
//        ArrayList<History> hs = new ArrayList<>();
//        hs.add(new History(new Date(), ms));
//        hs.add(new History("05-2021", ms));
//        Conversation c = new Conversation(new User("Joel"), hs);
//        storage.save(c);
    }
}
