
public class Spacecraft {


    private ICraftModel craftModel;
private String coordinate;
private int craftID;

    public Spacecraft(ICraftModel craftModel, String coordinate, int craftID) {
        this.craftModel = craftModel;
        this.coordinate = coordinate;
        this.craftID = craftID;
    }

    public void launch(){

    System.out.println("ID: "+craftID+" Coordinates: "+coordinate+ " Texture: "+craftModel.getModelTexture()
            +" Mesh: "+craftModel.getModelMesh()+" Speed: "+craftModel.getMaxSpeed()+" Acceleration: "+craftModel.getAcceleration()
    +" Damage: "+craftModel.getDamage());


}
}
