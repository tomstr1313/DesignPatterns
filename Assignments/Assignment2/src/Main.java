import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Spacecraft> hanger = new ArrayList<Spacecraft>();

        hanger.add(new Spacecraft(SpacecraftModelFactory.getFactory().getSpacecraftModel("NukeMayhem"),"abc",1));
        hanger.add(new Spacecraft(SpacecraftModelFactory.getFactory().getSpacecraftModel("SwiftMaple"),"xyz",2));
        hanger.add(new Spacecraft(SpacecraftModelFactory.getFactory().getSpacecraftModel("CoreDriller"),"hij",3));

for (int i = 0; i < hanger.size();i++ ){
    Spacecraft e = hanger.get(i);
    e.launch();
}

    }
}
