public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 9;
        archer.agility = 7;
        archer.intelligence = 10;
        archer.name = "Ace";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

        Character priest = new Character();

        priest.strength = 5;
        priest.agility = 8;
        priest.intelligence = 9;
        priest.name = "Stephen";
        priest.sayMyName();
        priest.sayMyStrength();
        priest.sayMyAgility();
        priest.sayMyIntelligence();

    }
}
