// Tworzymy klasę reprezentującą klasę postaci
public class CharacterClass {
    private String name;
    private double strengthModifier;
    private double defenceModifier;
    private double intelligenceModifier;
    private double dexterityModifier;
    private double agilityModifier;
    private double speedModifier;

    public CharacterClass(String name, double strengthModifier, double defenceModifier, double intelligenceModifier,
                          double dexterityModifier, double agilityModifier, double speedModifier) {
        this.name = name;
        this.strengthModifier = strengthModifier;
        this.defenceModifier = defenceModifier;
        this.intelligenceModifier = intelligenceModifier;
        this.dexterityModifier = dexterityModifier;
        this.agilityModifier = agilityModifier;
        this.speedModifier = speedModifier;
    }

    public void applyModifiers(Hero hero) {
        hero.setStrength((int) (hero.getStrength() * strengthModifier));
        hero.setDefence((int) (hero.getDefence() * defenceModifier));
        hero.setIntelligence((int) (hero.getIntelligence() * intelligenceModifier));
        hero.setDexterity((int) (hero.getDexterity() * dexterityModifier));
        hero.setAgility((int) (hero.getAgility() * agilityModifier));
        hero.setSpeed((int) (hero.getSpeed() * speedModifier));
    }
}
