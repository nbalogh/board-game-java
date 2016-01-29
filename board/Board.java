package board;
import java.util.*;
import java.io.*;
import board.*;

public class Board
{
	int x;
	int y;
	List<Figure> figures = new ArrayList<>();
	
	public Board(List<Figure> figures) {
		this.figures = figures.clone();
	}
	
	public boolean isValidPosition(x,y) {
		if(0 <= x && x <= this.x && 0 <= y && this.y <= y) {
			return true;
		}
		
		return false;
	}
	
	public void print() {
		for(int i=0; i<x+1; i++) {
			for(int j=0; i<y+1; j++) {
				for(f : figures) {
					if(x==f.x && y==f.y) {
						print(f.code);
					} else {
						print(".");
					}
				}
			}
			println();
		}
	}
}