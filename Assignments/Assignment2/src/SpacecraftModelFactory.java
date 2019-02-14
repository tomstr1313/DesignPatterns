import java.util.HashMap;

public class SpacecraftModelFactory {
    private HashMap craftModel;

    private static SpacecraftModelFactory factory = new SpacecraftModelFactory();

    public synchronized ICraftModel getSpacecraftModel(String type) {
        craftModel = new HashMap<>();
        if (craftModel.get(type) == null) {
            ICraftModel cm = new SpacecraftModel(type);
            return cm;
        } else
            return (ICraftModel) craftModel.get(type);

    }

    private SpacecraftModelFactory() {

    }

    public static SpacecraftModelFactory getFactory() {
        return factory;
    }


    private class SpacecraftModel implements ICraftModel {
        private String modelMesh;
        private String modelTexture;
        private int maxSpeed;
        private float acceleration;
        private float damage;

        private void setValues(String mesh, String texture, int speed, float acc, float dmg) {
            modelMesh = mesh;
            modelTexture = texture;
            maxSpeed = speed;
            acceleration = acc;
            damage = dmg;

        }

        private SpacecraftModel(String division) {
            //values are hardcoded for simplicity
            if (division.equals("NukeMayhem")) {
                setValues("Wire Mesh", "Smooth", 100, 90, 500);
            }
            if (division.equals("SwiftMaple")) {
                setValues("Rock Mesh", "Rock", 70, 40, 3000);
            }
            if (division.equals("CoreDriller")) {
                setValues("Plastic Mesh", "Hard", 130, 100, 200);
            }

        }




        public String getModelMesh() {
            return modelMesh;
        }

        public String getModelTexture() {
            return modelTexture;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public float getAcceleration() {
            return acceleration;
        }

        public float getDamage() {
            return damage;
        }
    }
}

