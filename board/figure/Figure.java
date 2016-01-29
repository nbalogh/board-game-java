package board.figure;
import java.util.*;
import java.io.*;
import board.Board;

public class Figure
{
	int x;
	int y;
	boolean isWhite;
	char code;
	Board board;
	
	public Figure(int x, int y, boolean isWhite, char code) {
		this.x = x;
		this.y = y;
		this.isWhite = isWhite;
		this.code = code;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public boolean getIsWhite() { return isWhite; }
	
	public char getCode() {
		if(isWhite) {
			return Character.toUpperCase(code);
		} else {
			return code;
		}
	}
	
	public void setBoard(Board board) {
		this.board = board;
	}
	
	public void moveTo(int x, int y) {
		if(board.isValidPosition(x,y)) {
			if (x == this.x+1 || x == this.x-1) {
				if(y == this.y+1 || y == this.y-1) {
					this.x = x;
					this.y = y;
				}
			}
		}
	}
}