package lab_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingAnimalController {
    public List<String> run(List<AnimalAbstract> animalList) {
        List<String> lstWinner = new ArrayList<>();
        int winnerSpeed = 0;

        for (AnimalAbstract animal : animalList) {
            int animalSpeed = animal.getSpeed();
            String animalName = animal.getName();
            System.out.println("Speed of " + animalName + " is: " + animalSpeed);
            if (animal.getSpeed() > winnerSpeed) {
                lstWinner.clear();
                winnerSpeed = animalSpeed;
                lstWinner.add(animalName);
            }
            else if(animal.getSpeed() == winnerSpeed){
                lstWinner.add(animalName);
            }
        }

        return lstWinner;
    }
}
