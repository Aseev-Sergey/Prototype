package sample.Nodes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public abstract class Node implements Cloneable{

    protected String name;

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Node(String input){
        name = input;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void draw(GraphicsContext gc, double startX, double startY);

    protected void restoreFill(GraphicsContext gc){
        gc.setFill(Color.BLACK);
    }

}
