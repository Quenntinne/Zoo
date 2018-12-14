package zoo;

import java.util.Scanner;

public class SoigneurManager implements SoigneurManagerIntf {

    public Soigneurs newSoigneur() {
        final Scanner userInput = new Scanner(System.in);
        System.out.print("Entrez le nom de votre nouveau soigneur : ");
        final String name = userInput.nextLine();
        System.out.print("Entrer la sexe de votre nouveau soigneur  : ");
        final String sexe = userInput.nextLine();
        System.out.print("Entrer l'age de votre nouveau soigneur  : ");
        final String ageInput = userInput.nextLine();
        final Integer age = Integer.parseInt(ageInput);
        Soigneurs newSoigneur = new Soigneurs(name,sexe,age);
        System.out.println("Vous venez d'embaucher " + newSoigneur.getName() + " !");
        getStats(newSoigneur);
        return newSoigneur;
    }

    public void getStats(Soigneurs soigneur){
        System.out.println("Prénom : " + soigneur.getName() + "\nAge : " + soigneur.getAge() + " ans\nExpérience : " + soigneur.getExperience());
    }
}
