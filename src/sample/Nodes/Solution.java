package sample.Nodes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Solution extends Node {

    final private double SEMIDIAG = 70.7;

    public Solution(){
        super("Узел решения");
    }

    @Override
    public void draw(GraphicsContext gc, double startX, double startY) {
        gc.strokePolygon(new double[]{
                startX, startX+SEMIDIAG, startX+2*SEMIDIAG, startX+SEMIDIAG
        }, new double[]{
                startY, startY-SEMIDIAG, startY, startY+SEMIDIAG
        }, 4);
        gc.setFill(Color.WHITE);
        gc.fillPolygon(new double[]{
                startX, startX+SEMIDIAG, startX+2*SEMIDIAG, startX+SEMIDIAG
        }, new double[]{
                startY, startY-SEMIDIAG, startY, startY+SEMIDIAG
        }, 4);
    }
}
