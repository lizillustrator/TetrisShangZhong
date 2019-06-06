import java.awt.*;

public class Cell {

    private Cell[][] cells;
    private int rows, cols;
    public static final int SIZE = 20;
    private boolean isFalling, isFallen;

    public Cell (int rows, int cols){
        cells = new Cell[rows][cols];
        rows = 20;
        cols = 10;
        isFalling = false;
        isFallen = false;


        for (int r = 0; r < cells.length; r++) {
            for (int c = 0; c < cells[0].length; c++) {
                cells[r][c] = new Cell(r, c);
            }
        }

    }


    public void draw(Graphics2D g2){

        for (int r = 0; r < cells.length; r++) {
            for (int c = 0; c < cells[0].length; c++) {
                cells[r][c].draw(g2);
            }
        }

    }







}




