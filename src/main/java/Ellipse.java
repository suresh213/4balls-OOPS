public class Ellipse{
    protected int x_axis;
    protected int y_axis;
    protected int speed;
    protected int diameter;

    public Ellipse(int x_axis, int y_axis, int speed,int diameter) {
        this.x_axis=x_axis;
        this.y_axis=y_axis;
        this.speed=speed;
        this.diameter=diameter;
    }

    public void show(){
        x_axis+=speed;
    }
}
