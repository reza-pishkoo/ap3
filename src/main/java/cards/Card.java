package cards;


import logicController.actions.ManaWyrm;

import javax.persistence.Entity;

//@Entity
public abstract class Card {
    @Override
    public String toString() {
        return name;
    }

    private int manaCost;
    private String name;
    private String description;
    private int value;
    private CardClass cardClass;
    private Type type;
    private Rarity rarity;
    private boolean canUse;


    public Card(){
        canUse = false;
    }

    public boolean isCanUse() {
        return canUse;
    }

    public void setCanUse(boolean canUse) {
        this.canUse = canUse;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCardClass(CardClass cardClass) {
        this.cardClass = cardClass;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    public CardClass getCardClass() {
        return cardClass;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Type getType() {
        return type;
    }

}
