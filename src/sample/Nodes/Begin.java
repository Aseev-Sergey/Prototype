package sample.Nodes;

import javafx.scene.canvas.GraphicsContext;

public class Begin extends Node {

    private double diam;

    public Begin(){
        super("Начальный узел");
        diam = 40;
    }

    @Override
    public void draw(GraphicsContext gc, double startX, double startY) {
        restoreFill(gc);
        gc.fillOval(startX, startY, diam, diam);
    }
}
