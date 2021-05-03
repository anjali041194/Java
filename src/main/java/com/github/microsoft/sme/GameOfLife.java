package com.github.microsoft.sme;

public final class GameOfLife {
    private Integer num;

    public GameOfLife(Integer num) {
        this.num = num;
    }

    public void processInput(){
        System.out.println("BLABLA"+ this.num);
    }

    public static void main(final String... args){
        GameOfLife g = new GameOfLife(5);
        g.processInput();
    }
}