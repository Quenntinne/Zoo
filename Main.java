package zoo;

import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap<String, Soigneurs> soigneursMap = new HashMap<>();
        SoigneurManagerIntf sm = new SoigneurManager();
        System.out.println("Bienvenue à toi dans ton zoo !\nNous allons créer un premier soigneur pour commencer :)");
        Soigneurs bily = sm.newSoigneur();
        soigneursMap.put(bily.getName(),bily);
        System.out.println("Super ! Bienvenue à " + bily.getName() + " dans ton équipe !");
        AnimalManagerIntf am = new AnimalManager();
        Animal bob = am.adoptAnimal();

    }
}
