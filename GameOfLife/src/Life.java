
public class Life {

	private final int ROWS = 20;
	private final int COLUMNS = 20;
	private final int GENERATIONS = 100;
	private boolean[][] board = new boolean[ROWS][COLUMNS]; // holds current generation
	private boolean[][] temp = new boolean[ROWS][COLUMNS]; // holds next generation
	private boolean[][] swap; // a reference we will use to swap board and temp

	public Life() {
	}

	/**
	 * Use this method to iterate through your generations. 
	 * Intended to be called from main, 
	 * for example:
	 * 		Life game = new Life();
	 * 		game.play();
	 * 
	 * To help make the console appear animated, 
	 * use this at the end of each generation's loop:
	 * 
	 * try {
	 * 	Thread.sleep(100);
	 * } catch (InterruptedException e) {
	 * // handle exception here
	 * }
	 */
	public void play() {

	}

	/**
	 * Use this method to initialize your board field.
	 * The board instance stores the state of the current generation
	 * of cells, represented as boolean values (true for alive, false for dead)
	 */
	void initializeBoard() {
		
	}

	/**
	 * Implementation should print your current generation
	 * of cells to the console.
	 * 		Alive cells are represented by "*" characters
	 * 		Dead cells are represented by a space (" ")
	 * 
	 * Note: To simulate animation in the console, print
	 * 100 blank lines.
	 */
	void printBoard() {

	}

	/**
	 * Use this method to determine the fate of a single cell,
	 * by conditionally checking the 4 rules of the Game of Life.
	 * Call the getNumAliveNeighbors method to help.
	 * 
	 * Update the board variable appropriately.
	 * 
	 */
	void determineFate() {

	}

	/**
	 * A helper method to determine the number of alive 
	 * cells surrounding the board cell referenced
	 * by the row and column values passed 
	 * @param row The row index of the cell to check
	 * @param column The column index of the cell to check
	 * @return the number of alive cells surrounding the referenced cell.
	 */
	int getNumAliveNeighbors(int row, int column) {

	}
}
