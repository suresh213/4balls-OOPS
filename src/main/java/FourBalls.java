import processing.core.PApplet;

public class FourBalls extends PApplet{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    public static final int DIAMETER=25;
    static Ellipse ellipses[] = new Ellipse[4];

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
        for(int ellipse=0;ellipse<4;ellipse++){
            ellipses[ellipse] = new Ellipse(0,(ellipse+1)*HEIGHT/5,ellipse+1,DIAMETER);
        }
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public void draw() {
        for(int ellipse=0;ellipse<4;ellipse++){
            ellipse(ellipses[ellipse].x_axis,ellipses[ellipse].y_axis,ellipses[ellipse].diameter,ellipses[ellipse].diameter);
            ellipses[ellipse].show();
        }
    }
}