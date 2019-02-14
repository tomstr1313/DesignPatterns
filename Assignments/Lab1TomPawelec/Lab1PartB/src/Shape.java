public abstract class Shape implements Comparable<Shape>{
    private int id;
    static int numShapes = 1;
    
    public Shape() {
        this.id = numShapes++;
    }
    
    public int compareTo(Shape o){
        return(int)(this.getPerimeter() - o.getPerimeter());
        
    }

    public int getId() {
        return id;
    }

    public static int getNumShapes() {
        return numShapes;
    }

    @Override
    public String toString() {
        return String.format("Object ID %d, Shape Type %s, Area %.2f, Perimeter %.2f ", 
                this.getId(), this.getShapeType(),this.getArea(),this.getPerimeter());
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShapeType();
   
}
