package com.singerw.exception;

public class IllegalArgumentException {
    public static void main(String[] args) {
        g g = new g(255,255,255);
        System.out.println(g);

    }
}

class g{
        private int red;
        private int green;
        private int blue;

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public g(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}


