package LoAServer;

import LoAServer.Creature.Creature;

import java.util.ArrayList;

public class Fight {
    private ArrayList<Hero> heroes;
    private ArrayList<Integer> heroesBattleScores;
    private ArrayList<Hero> pendingInvitedHeroes;
    private Creature creature;
    private boolean battleRoundEnded;

    public Fight() {}

    public Fight(Hero hero, Creature creature) {
        heroes = new ArrayList<>();
        heroes.add(hero);
        heroesBattleScores = new ArrayList<>();
        heroesBattleScores.add(0);
        pendingInvitedHeroes = new ArrayList<>();
        this.creature = creature;
    }

    public boolean canStartFight() {
        if (pendingInvitedHeroes.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public ArrayList<Integer> getHeroesBattleScores() {
        return heroesBattleScores;
    }

    public void setHeroesBattleScores(ArrayList<Integer> heroesBattleScores) {
        this.heroesBattleScores = heroesBattleScores;
    }

    public ArrayList<Hero> getPendingInvitedHeroes() {
        return pendingInvitedHeroes;
    }

    public void setPendingInvitedHeroes(ArrayList<Hero> pendingInvitedHeroes) {
        this.pendingInvitedHeroes = pendingInvitedHeroes;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public boolean isBattleRoundEnded() {
        return battleRoundEnded;
    }

    public void setBattleRoundEnded(boolean battleRoundEnded) {
        this.battleRoundEnded = battleRoundEnded;
    }
}