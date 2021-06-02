package sample.Nodes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Operation extends Node {

    private double width;
    private double height;
    private double arc;

    public Operation(){
        super("Узел управления");
        width = 120;
        height = 60;
        arc = 50;
    }

    @Override
    public void draw(GraphicsContext gc, double startX, double startY) {
        gc.strokeRoundRect(startX, startY,width,height,arc,arc);
        gc.setFill(Color.WHITE);
        gc.fillRoundRect(startX, startY,width,height,arc,arc);
    }
}
