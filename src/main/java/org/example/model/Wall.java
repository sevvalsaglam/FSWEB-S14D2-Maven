package org.example.model;

import org.example.model.enums.PaintColor;

import java.util.Objects;

public class Wall {
    private String direction;


    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void create(){
        System.out.println("Wall has been built.");
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }


}

