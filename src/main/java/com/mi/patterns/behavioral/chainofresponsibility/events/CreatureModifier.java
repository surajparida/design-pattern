package com.mi.patterns.behavioral.chainofresponsibility.events;

public class CreatureModifier { // protected, not private!
    protected Game game;
    protected Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}

