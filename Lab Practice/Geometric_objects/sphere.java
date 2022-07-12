package Geometric_objects;

interface GeometricObjects {
    public double getVolume();
}

class cuboid implements GeometricObjects{
    public double length;
    public double breadth;
    public double height;

    public double getVolume(){
        return length*breadth*height;
    }
}

class sphere implements GeometricObjects{
    public double radius;
    public double getVolume(){
        return (4/3)*Math.PI*(radius*radius*radius);
    }
    public void set_radius(int R1){
        this.radius = R1;
    }
    public static void main(String[] args) {
        sphere S1 = new sphere();
        S1.set_radius(22);
        double x1 = S1.getVolume();
        System.out.println("Volume : "+x1);
    }
}
