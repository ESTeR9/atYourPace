import processing.core.PApplet;

public class AtYourPace extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int SPEED = 1;
    public static final int DIA = 10;

    public static void main(String[] args) {
        PApplet.main("AtYourPace", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(87, 87, 87);
    }

    @Override
    public void draw() {
        stroke(255, 0, 100);
        fill(255, 0, 100);
        ellipse(SPEED, HEIGHT / 5, DIA, DIA);
        stroke(20, 240, 200);
        fill(20, 240, 200);
        ellipse(2 * SPEED, 2 * HEIGHT / 5, DIA, DIA);
        stroke(200, 240, 20);
        fill(200, 240, 20);
        ellipse(3 * SPEED, 3 * HEIGHT / 5, DIA, DIA);
        stroke(180, 210, 255);
        fill(180, 210, 255);
        ellipse(4 * SPEED, 4 * HEIGHT / 5, DIA, DIA);

        SPEED += 1;
    }
}
