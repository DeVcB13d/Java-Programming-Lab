public abstract class shape {
    public abstract double getArea();
}

class circle extends shape{
    public double radius;
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class rectangle extends shape{
    public double side;
    public double getArea(){
        return side*side;
    }
}
