# Game Of Life

## Introduction

In this project we will be creating [Conway's Game of Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).  

**The Rules:**  

The Game of Life takes place on a grid (a 2-dimensional array in Java). Each cell of the grid is considered either "**alive**" or "**dead**." Each cell also interacts with its **eight neighbors**, which are the cells that are horizontally, vertically, or diagonally adjacent to the cell.

The Game of Life proceeds in "generations", or steps. At each step, the following transitions occur:

- If the cell is "alive," there are three rules:
- If the cell has fewer than two live neighbors, it dies--as if by under-population.
- If the cell has more than three live neighbors, it dies--as if by over-population.
- If a cell has exactly two or three live neighbors, it survives to the next generation.
- If the cell is "dead," the following rule applies:
- If a dead cell has exactly three live neighbors, it becomes alive in the next generation, as if by reproduction.
- Each of these rules apply only to members of the next generation.

## The Design  

To get started let's think about how we might implement this game in Java code.  

We'll need to include a way to store the game state, as well as a way to determine the next generation. You can store the state using boolean grids (boolean[][] grid). Use one grid to represents the current generation, and another one to represent the next generation (and maybe a swap grid, to swap the values). Once you've set the grid for the next generation, the two should be swapped. In the starter code given below, use your Life class to represent a game instance. Include instance variables to store the rows, columns, and generations for the game (or pass these values to a method), as well as instance variables to keep track of the current generation grid, the next generation grid, and a swap grid.  

Additionally we'll need to provide:  

- A method called `initializeBoard()` to create the initial grid by activating 10% of grid cells randomly (hint: use `Math.random() > 0.9`).
- A method called `printBoard()` to print the grid to the console. Color "alive" cells as "\*" characters and "dead" cells as a blank space (" "). 
- A method called `determineFate()` to determine the state of each cell based on game rules. You might want to consider creating the following helper method:
-- `getNumAliveNeighbors(boolean[][] grid, int i, int j)`, which gets the number of "alive" neighbors for the designated grid. Pay attention to corner cases (what are the horizontal neighbors of the cell at 0,0?) (hint: These cells won't have neighbors around, so you'll need to have a condition to ensure you don't get an ArrayOutOfBoundsException).
- A `play()` method to start a new game. This will be called from the runner class's `main` method. The game will run for a set number of generations.

## Getting Started

**Create a new Java Project using Eclipse. Name it "GameOfLife":**

![Create New Project](https://raw.github.com/kswarthout/has-apcs-2019-2020/master/GameOfLife/img/guide_1_create_new_project.PNG?raw=true)

**Add the following files to your project:**
- [Life.java]()
- [Play.java]()

**You can test your code by running the program's main method in Play.java**
