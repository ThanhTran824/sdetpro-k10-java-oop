package lab_10;

import lab_09.RacingAnimal;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    // Service method
    public String getTheWinner(List<Animal> animalList) {
        String winner = "";

        int winnerSpeed = 0;
        List<Animal> racerAnimalList = getRacerAnimals(animalList);
        for(Animal animal : racerAnimalList){
            int animalSpeed = animal.getAnimalSpeed();
            String animalName = animal.getAnimalName();
            System.out.println("Speed of " + animalName + " is: " + animalSpeed);
            if(animal.getAnimalSpeed() > winnerSpeed){
                winnerSpeed = animalSpeed;
                winner = animalName;
            }
        }

        return winner;
    }

    // Support method
    private List<Animal> getRacerAnimals(List<Animal> animalList) {
        List<Animal> racerAnimalList = new ArrayList<>();

        for(Animal animal : animalList){
            if(!animal.getFly()){
                racerAnimalList.add(animal);
            }
        }

        return racerAnimalList;
    }
}
