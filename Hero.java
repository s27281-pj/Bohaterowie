// Tworzymy klasę reprezentującą bohatera
public class Hero {
    private String name;
    private int level;
    private int experience;
    private int strength;
    private int defence;
    private int intelligence;
    private int dexterity;
    private int agility;
    private int speed;

    public Hero(String name, int strength, int defence, int intelligence, int dexterity, int agility, int speed) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.strength = strength;
        this.defence = defence;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.agility = agility;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void gainExperience(int experiencePoints) {
        this.experience += experiencePoints;
        int levelUpThreshold = 10 * this.level;

        if (this.experience >= levelUpThreshold) {
            this.level++;
            this.experience -= levelUpThreshold;
            System.out.println(this.name + " awansował na poziom " + this.level + "!");
        }
    }

    public void distributeExperiencePoints(int strengthPoints, int defencePoints, int intelligencePoints,
                                           int dexterityPoints, int agilityPoints, int speedPoints) {
        this.strength += strengthPoints;
        this.defence += defencePoints;
        this.intelligence += intelligencePoints;
        this.dexterity += dexterityPoints;
        this.agility += agilityPoints;
        this.speed += speedPoints;
    }

    public void displayStats() {
        System.out.println("Statystyki bohatera " + this.name + ":");
        System.out.println("Poziom: " + this.level);
        System.out.println("Siła: " + this.strength);
        System.out.println("Obrona: " + this.defence);
        System.out.println("Inteligencja: " + this.intelligence);
        System.out.println("Celność: " + this.dexterity);
        System.out.println("Zręczność: " + this.agility);
        System.out.println("Szybkość: " + this.speed);
        System.out.println();
    }
}
