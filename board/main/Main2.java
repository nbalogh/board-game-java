package board.main;
import java.util.*;
import java.io.*;
import board.figure.Figure;
import board.Board;

public class Main2
{
	public static void main(String[] args)
	{
		Figure a = new Figure(0,0,true,'a');
		Figure b = new Figure(4,0,true,'b');
		Figure c = new Figure(0,5,true,'c');
		Figure d = new Figure(3,3,true,'d');
		List<Figure> figures = new ArrayList<>();
		figures.add(a);
		figures.add(b);
		figures.add(c);
		figures.add(d);
		Board tabla = new Board(6,6,figures);
		tabla.print();
	}
}