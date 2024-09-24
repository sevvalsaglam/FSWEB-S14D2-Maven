package org.example.model;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    private Bedroom(String name, Wall wall1, Wall wall2,
                    Wall wall3, Wall wall4, Ceiling ceiling,
                    Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet ){
        this.name=name;
        this.wall1=wall1;
        this.wall2=wall2;
        this.wall3=wall3;
        this.wall4=wall4;
        this.ceiling=ceiling;
        this.bed=bed;
        this.lamp=lamp;
        this.wardrobe=wardrobe;
        this.carpet=carpet;
    }

    public String getName() {
        return this.name;
    }

    public Wall getWall1() {
        return this.wall1;
    }

    public Wall getWall2() {
        return this.wall2;
    }

    public Wall getWall3() {
        return this.wall3;
    }

    public Wall getWall4() {
        return this.wall4;
    }

    public Ceiling getCeiling() {
        return this.ceiling;
    }

    public Bed getBed() {
        return this.bed;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public Wardrobe getWardrobe() {
        return this.wardrobe;
    }

    public Carpet getCarpet() {
        return this.carpet;
    }
}
