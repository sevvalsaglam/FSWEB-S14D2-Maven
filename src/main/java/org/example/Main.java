package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bed bed =new Bed("Çift kişilik", 4, 200, 1, 2);
        Wall wall1= new Wall("west");
        Wall wall2= new Wall("south");
        Wall wall3= new Wall("north");
        Wall wall4= new Wall("east");
        Wall[] walls = new Wall[]{wall1,wall2,wall3,wall4};
        Carpet carpet=new Carpet(90,100, PaintColor.RED);
        Ceiling ceiling=new Ceiling(300, PaintColor.WHITE);
        Lamp lamp=new Lamp(LampType.NEON, true, 28);
        Wardrobe wardrobe =new Wardrobe(6, 7,1);
        Bedroom bedroom1=new Bedroom(wall1, wall2, wall3, wall4, ceiling, lamp, carpet, "Bedroom1", bed, wardrobe);
        bedroom1.createBedroom();


    }
}