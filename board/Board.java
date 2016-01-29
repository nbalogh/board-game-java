package board;
import java.util.*;
import java.io.*;
import board.figure.Figure;

public class Board
{
	int x;
	int y;
	List<Figure> figures = new ArrayList<>();
	
	public Board(int x, int y, List<Figure> figures) {
		this.x = x;
		this.y = y;
		this.figures = figures;
	}
	
	public boolean isValidPosition(int x, int y) {
		if(0 <= x && x <= this.x && 0 <= y && this.y <= y) {
			return true;
		}
		
		return false;
	}
	
	public void print() {
		for(int i=0; i<x+1; i++) {
			for(int j=0; i<y+1; j++) {
				for(Figure f : figures) {
					if(x==f.getX() && y==f.getY()) {
						System.out.print(f.getCode());
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}
}