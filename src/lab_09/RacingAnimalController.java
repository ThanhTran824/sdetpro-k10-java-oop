package lab_09;

import java.util.List;

public class RacingAnimalController {

    public String calculateWinner(List<RacingAnimal> animalList) {
        String winner = "";
        int winnerSpeed = 0;
        for(RacingAnimal animal : animalList){
            System.out.println("Speed of " + animal.getName() + " is: " + animal.getSpeed());
            if(animal.getSpeed() > winnerSpeed){
                winnerSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }

        return winner;
    }
}
