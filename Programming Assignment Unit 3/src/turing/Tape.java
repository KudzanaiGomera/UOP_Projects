package turing;

import java.util.Stack;

/**
 * @author kudzie
 *
 */
/**
 * @author kudzie
 * 
 * 
 *
 */
public class Tape {

	private Cell currentPosition;
	private char currentCell;
	private Stack<Character> left = new Stack<Character>(); // left part of tape
	private Stack<Character> right = new Stack<Character>(); // right part of tape
	private final static char BLANK = '#';
	
	/**
	 * @return the current position of the cell
	 */
	public Cell getCurrentCell()
	{
		return currentPosition;
	}
	
	/**
	 * @return the current cell
	 */
	public char getContent()
	{
		return currentCell;
	}
	
	/**
	 * @param ch sets the character to specified value
	 */
	public void setContent(char ch) {
		
		right.set(0, ch);
	}
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	public Tape()
	{
		Cell addCell = new Cell();
		addCell.content = ' ';
		addCell.prev = null;
		addCell.next = null;
		currentPosition = addCell;
	}
	
	// move tape head left one position
	/**
	 * moves the cell to the right
	 */
	public void moveLeft() {
		right.push(currentCell);
		if (left.isEmpty())
			left.push(BLANK); // increase size of tape if necessary
		currentCell = left.pop();
	}

	// move tape head right one position
	public void moveRight() {
		left.push(currentCell);
		if (right.isEmpty())
			right.push(BLANK); // increase size of tape if necessary
		currentCell = right.pop();
	}
	
	/**
	 * @return return the string from all th cells of the tape
	 */
	public String getTapeContents()
	{
		 String result = "";
	        for (Character s : left) {
	            result += s;
	        }
	        for (Character s : right) {
	            result += s;
	        }
	return result; 
	}

}
