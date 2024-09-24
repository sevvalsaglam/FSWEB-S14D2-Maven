package org.example.model;

import org.example.model.enums.PaintColor;

public class Wall {
    private String direction;


    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

    public void create(){
        System.out.println("Wall has been built.");
    }


}

