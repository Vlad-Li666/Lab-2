package com.company;

import java.util.ArrayList;
import java.util.List;

public class Quadrangles {
    private final List<Quadrangle> quadrangles;

    public Quadrangles(){
        quadrangles = new ArrayList<>();
    }

    public List<Quadrangle> getQuadrangles() {
        return quadrangles;
    }

    public void add(Quadrangle quadrangle) {
        this.quadrangles.add(quadrangle);
    }

    public void remove(Quadrangle quadrangle) {
        this.quadrangles.remove(quadrangle);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            quadrangles.add(Quadrangle.generate());
        }
    }

    public void MinPerimetr(){
        int min = 1000;
        for (Quadrangle quadrangle : this.quadrangles){
            if (quadrangle.Perimetr() < min){
                min = quadrangle.Perimetr();
            }
        }
        System.out.println("\nЧетырехугольник с минимальным периметром: ");
        for (Quadrangle quadrangle : this.quadrangles){
            if (min == quadrangle.Perimetr()){
                System.out.println(quadrangle);
            }
        }
    }

    @Override
    public String toString() {
        return "\n\n\nЧетырехугольники" + quadrangles + "; ";
    }
}
