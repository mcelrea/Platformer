package com.mcelrea;

import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;

/**
 * Created by Tech on 2/23/2016.
 */
public class CollisionCell {
    private final TiledMapTileLayer.Cell cell;
    private int cellRow;
    private int cellCol;

    public CollisionCell(TiledMapTileLayer.Cell cell, int cellRow, int cellCol) {
        this.cell = cell;
        this.cellRow = cellRow;
        this.cellCol = cellCol;
    }

    public boolean isEmpty() {
        return cell == null;
    }

    public int getId() {
        return cell.getTile().getId();
    }

    @Override
    public String toString() {
        return "" + cell.getTile().getId();
    }

    public int getCellRow() {
        return cellRow;
    }

    public int getCellCol() {
        return cellCol;
    }
}
