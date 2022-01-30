import processing.core.PApplet;

import static java.awt.image.ImageObserver.HEIGHT;

public class Game extends PApplet {
    public static final int DIAMETER = 20;
    private static final int WIDTH =640;
    private static final int HEIGHT =480;
    int x1=0,x2=0,x3=0,x4=0;

    public static void main(String [] args){
        PApplet.main("Game");
    }

    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    public void draw(){
        //background(255);
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x1,HEIGHT/5, DIAMETER,DIAMETER);
        x1++;
        ellipse(x2,2*HEIGHT/5,DIAMETER,DIAMETER);
        x2+=2;
        ellipse(x3,3*HEIGHT/5,DIAMETER,DIAMETER);
        x3+=3;
        ellipse(x4,4*HEIGHT/5,DIAMETER,DIAMETER);
        x4+=4;
    }
}
