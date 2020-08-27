package Asteroids;

import javafx.scene.Node;

import javafx.geometry.Point2D;

public class GameObject {
    private Node view;
    private Point2D velocity = new Point2D(0,0);

    private boolean alive = true;

    public GameObject(Node view) {
        this.view = view;
    }

    public void update(){
        view.setTranslateX(view.getTranslateX() + velocity.getX());
        view.setTranslateY(view.getTranslateY() + velocity.getY());
    }

    public double getRotate() {
        return view.getRotate();
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void rotateRight() {
        view.setRotate(view.getRotate() + 5);
    }

    public Node getView() {
        return view;
    }

    public void setView(Node view) {
        this.view = view;
    }

    public void rotateLeft() {
        view.setRotate(view.getRotate() - 5);
    }
}

