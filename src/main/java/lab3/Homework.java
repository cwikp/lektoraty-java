package lab3;

public class Homework {

    public static void main(String[] args) {
        int pewdiepieSubs = 93877840;
        int tseriesSubs = 93662840;

        long worldPopulation = 7700000000L;
        int subGap = pewdiepieSubs - tseriesSubs;

        double pewdiepieSubsWorldPercentage = (double) pewdiepieSubs / worldPopulation;
        long peopleWithoutSubs = worldPopulation - pewdiepieSubs - tseriesSubs;

        System.out.println("PewDiePie ma obecnie: " + pewdiepieSubs + " subksrybcji");
        System.out.println("T-Series ma obecnie: " + tseriesSubs + " subksrybcji");
        System.out.println("Ilość ludzi na świecie to: " + worldPopulation);
        System.out.println("Różnica między kanałami wynosi: " + subGap + " subskrybcji!");
        System.out.println(pewdiepieSubsWorldPercentage + " taki odsetek ludzi subskrybuje pewdiepaja");
        System.out.println(peopleWithoutSubs + " ludzi jeszcze nie zasubskrybowało :(");

        if (pewdiepieSubs > tseriesSubs) {
            System.out.println("Pewdiepie wygrywa!");
        } else {
            System.out.println("T-Series wygrywa :(");
        }

        for (int i = 0; i < 10; i++) {
            pewdiepieSubs++;
            tseriesSubs += 2;
            System.out.println("PewDiePie ma obecnie: " + pewdiepieSubs + " subów");
            System.out.println("T-Series ma obecnie: " + tseriesSubs + " subów");
        }

        while (tseriesSubs < pewdiepieSubs) {
            pewdiepieSubs++;
            tseriesSubs += 2;
            System.out.println("PewDiePie ma obecnie: " + pewdiepieSubs + " subów");
            System.out.println("T-Series ma obecnie: " + tseriesSubs + " subów");
        }

        System.out.println(">>> PewDiePie ma obecnie: " + pewdiepieSubs + " subów");
        System.out.println(">>> T-Series ma obecnie: " + tseriesSubs + " subów");
    }
}
