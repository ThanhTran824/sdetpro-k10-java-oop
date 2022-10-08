package lab_10;

import java.security.SecureRandom;

public class Animal {
    private int animalSpeed;
    private Boolean isFly;
    private String animalName;

    private Animal(Builder builder) {
        this.animalSpeed = builder.animalSpeed;
        this.isFly = builder.isFly;
        this.animalName = builder.animalName;
    }

    //Getter

    public int getAnimalSpeed() {
        return this.animalSpeed;
    }

    public Boolean getFly() {
        return this.isFly;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public static class Builder {
        private int animalSpeed;
        private Boolean isFly;
        private String animalName;

        public Animal build() {
            return new Animal(this);
        }

        //Setter
        public Builder setAnimalSpeed(int randomSpeed) {
            this.animalSpeed = new SecureRandom().nextInt(randomSpeed);
            return this;
        }

        public Builder setFly(boolean isFly) {
            this.isFly = isFly;
            return this;
        }

        public Builder setAnimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }
    }
}
