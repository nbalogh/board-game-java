package board.figure;
import java.util.*;
import java.io.*;
import board.*;

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
	
	public getX() { return x; }
	public getY() { return y; }
	public getIsWhite() { return isWhite; }
	
	public getCode() {
		if(isWhite) {
			return Character.toUpperCase(code);
		} else {
			return code;
		}
	}
	
	public setBoard(board) {
		this.board = board;
	}
	
	public void moveTo(x,y) {
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