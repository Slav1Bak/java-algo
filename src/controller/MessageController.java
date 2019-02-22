package controller;

import model.Messge;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageController {
    private Deque<Messge> messages = new ArrayDeque<>();
    public void addMessage(String content, String author) {
        Messge m = new Messge(content, author);
        messages.addFirst(m);
        System.out.println("Dodano wiadomosc");
    }
    public void getMessage(){
        System.out.println(messages.getLast());
    }
    public void deleteMessage(){
        messages.removeLast();
    }
    public int getSize(){
        return messages.size();
    }
}
