public class Rectangle {
    //properties : DATA
    private String name;
    private String color;
    private double length;
    private double width;

    // getter/setter methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    //toString method
    @Override
    public String toString(){
        return "Rectangle{" +
                " name='" + name + '\''+
                ", color='" + color + '\'' +
                ",length="+ length +
                ",width="+ width +
                '}';
    }

    // working methods
    public double area()
    {
        return this.length * this.width;
    }
    public double perimeter()
    {
        return 2*(this.length + this.width);
    }

    //enquiry methods
    public boolean isSquare()
    {
        return this.length == this.width;
    }

    //no-argument constructor
    public Rectangle(){
        this.name="xyz";
        this.color="White";
        this.length=6;
        this.width=4;
    }

    //all argument constructor
    public Rectangle(String name, String color, double length, double width){
        this.name = name;
        this.color = color;
        this.length = length;
        this.width = width;
    }
    //required argument constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
}
