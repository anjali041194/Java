package com.github.microsoft.sme;

import java.util.List;

public class Cell {
    private boolean isAlive;
    private boolean previousIsAlive;
    private int lastProcessedGenerarion;
    List<Cell> neighbours;

    public Cell(boolean isAlive, List<Cell> neighbours) {
        this.isAlive = isAlive;
        this.neighbours = neighbours;
        this.previousIsAlive = isAlive;
        this.lastProcessedGenerarion = 0;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public List<Cell> getNeighbours() {
        return neighbours;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setNeighbours(List<Cell> neighbours) {
        this.neighbours = neighbours;
    }
}
