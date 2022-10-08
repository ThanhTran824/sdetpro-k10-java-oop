package lab_09;

import java.util.List;

public class RacingAnimalController {

    public String calculateWinner(List<RacingAnimal> animalList) {
        String winner = "";
        int winnerSpeed = 0;
        for (RacingAnimal animal : animalList) {
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
