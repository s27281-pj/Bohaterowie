// Tworzymy klasę testową, aby przetestować mechanizm rozwoju bohatera
public class Main {
    public static void main(String[] args) {
        // Tworzenie klas postaci
        CharacterClass mageClass = new CharacterClass("Mag", 1.0, 1.0, 1.2, 1.05, 1.02, 1.0);
        CharacterClass knightClass = new CharacterClass("Rycerz", 1.2, 1.1, 1.0, 1.05, 1.02, 1.0);
        CharacterClass archerClass = new CharacterClass("Łucznik", 1.05, 1.05, 1.0, 1.2, 1.1, 1.05);

        // Tworzenie bohaterów z odpowiednimi klasami postaci
        Hero mage = new Hero("Mag", 100, 100, 100, 100, 100, 100);
        Hero knight = new Hero("Rycerz", 100, 100, 100, 100, 100, 100);
        Hero archer = new Hero("Łucznik", 100, 100, 100, 100, 100, 100);

        // Aplikowanie modyfikatorów na statystyki bohaterów
        mageClass.applyModifiers(mage);
        knightClass.applyModifiers(knight);
        archerClass.applyModifiers(archer);

        // Zdobycie doświadczenia przez bohaterów
        mage.gainExperience(25);
        knight.gainExperience(15);
        archer.gainExperience(12);

        // Przydzielenie punktów doświadczenia na statystyki
        mage.distributeExperiencePoints(0, 0, 5, 3, 2, 0);
        knight.distributeExperiencePoints(2, 3, 0, 0, 0, 0);
        archer.distributeExperiencePoints(0, 0, 0, 4, 1, 2);

        // Wyświetlenie statystyk bohaterów
        mage.displayStats();
        knight.displayStats();
        archer.displayStats();
    }
}