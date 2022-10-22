package lab_11;

import java.util.List;

public class RacingAnimalController {
    public String run(List<AnimalAbstract> animalList) {
        String winner = "";
        int winnerSpeed = 0;

        for (AnimalAbstract animal : animalList) {
            int animalSpeed = animal.getSpeed();
            String animalName = animal.getName();
            System.out.println("Speed of " + animalName + " is: " + animalSpeed);
            if (animal.getSpeed() > winnerSpeed) {
                winnerSpeed = animalSpeed;
                winner = animalName;
            }
        }

        return winner;
    }
}
