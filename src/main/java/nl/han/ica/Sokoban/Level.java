package nl.han.ica.Sokoban;

public class Level {
	/*
    b = box     / B = box on goal 
    p = player  / P = player on goal
    . = space
    * = wall
    g = goal
    w = water   / W = box in water
    */
	char b = 'b', B = 'b', p = 'p', P = 'p', W = '*', F = '.', g = 'g', water = 'w', bridge = 'W';
    char[][] board;
    public Level() {
        this.board = new char[][]{
            {W, W, W, W, W}, 
            {F, water, b, p, F}, 
            {F, F, F, b, F}, 
            {F, F, F, F, F}};
    }
}
