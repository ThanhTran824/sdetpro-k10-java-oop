package lab_12;

import java.util.Arrays;
import java.util.List;

public class AnimalRacingTest {
    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        Dog dog = new Dog();
        Horse horse = new Horse();
        Eagle eagle = new Eagle();

        List animalList = Arrays.asList(dog, horse, eagle);
        List<MoveAble> eligibleList = racingController.eligibleList(animalList);
        List<MoveAble> winners = racingController.getWinner(eligibleList);

        if(winners.size() == 1){
            System.out.println("The winner is: " + winners.get(0));
        }
        else if(winners.size() > 1){
            System.out.print("The winners are: ");
            for(MoveAble animal : winners){
                System.out.print(animal + " ");
            }
        }
    }
}
