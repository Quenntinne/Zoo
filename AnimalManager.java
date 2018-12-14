package zoo;

import java.util.Scanner;

public class AnimalManager implements AnimalManagerIntf {
    public void feed(Animal animal, Food food){
        animal.setHunger(animal.getHunger() + food.getHungering());
        animal.setEnergy(animal.getEnergy() + food.getEnergying());
        System.out.println(animal.getName() + " has been feeded with " + food.getFoodName() + " !");
    }

    public void vaccinate(Animal patient){
        patient.setVacinnated(true);
        System.out.println(patient.getName() + " has been vaccinated");
    }

    public Animal adoptAnimal() {
        final Scanner userInput = new Scanner(System.in);
        System.out.print("Entrer la race de votre nouvel animal  : ");
        final String type = userInput.nextLine();
        System.out.print("Entrez le nom de votre nouvel animal : ");
        final String name = userInput.nextLine();

        Animal newAnimal = new Animal(type,name);
        System.out.println("Vous venez d'adopter " + newAnimal.getName() + " !");
        getStats(newAnimal);
        return newAnimal;
    }

    public void getStats(Animal animal){
        System.out.println("Name : " + animal.getName() +  "\nEnergy : " + animal.getEnergy() + "/10\nHunger : " + animal.getHunger() + "/10\nVaccinated : " + animal.getVacinnated());
    }

}
