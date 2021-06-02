package sample.Nodes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class End extends Node {

    private double diam;

    public End(){
        super("Финальный узел");
        diam = 40;
    }

    @Override
    public void draw(GraphicsContext gc, double startX, double startY) {
        restoreFill(gc);
        gc.fillOval(startX,startY,diam,diam);
        gc.setFill(Color.WHITE);
        gc.fillOval(startX+5,startY+5,diam-10,diam-10);
        restoreFill(gc);
        gc.fillOval(startX+10,startY+10,diam-20,diam-20);
    }
}
