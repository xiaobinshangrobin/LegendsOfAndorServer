package LoAServer;

import java.util.ArrayList;
import java.util.List;

enum PLAYER_STATUS{
    PLAYER_TURN, PLAYER_WAIT
}

public class Player {
    private String username;
    private String password;
    private String color;
    private boolean isLoggedIn;
    private Hero hero;
    private boolean isReady;
    private PLAYER_STATUS player_status;

    public Player() {
    }

    public Player(String username, String password, String color) {
        this.username = username;
        this.password = password;
        this.color = color;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public boolean isReady() {
        return isReady;
    }
    public void setReady(boolean ready) {
        isReady = ready;
    }

    public PLAYER_STATUS getPlayer_status() { return player_status;}
    public void setPlayer_status(PLAYER_STATUS player_status) { this.player_status = player_status; }
}
