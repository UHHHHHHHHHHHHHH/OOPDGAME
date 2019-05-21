package nl.han.ica.Sokoban;

import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.TextObject;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.View;

public class Sokoban extends GameEngine{
	private Player player;
	private int startX = 90;
	private int startY = 90;
	public static String MEDIA_URL = "src/main/java/nl/han/ica/Sokoban/images/Sokoban/";
	public static void main(String[] args) {
		Sokoban sokoban = new Sokoban();
		
		sokoban.runSketch();
	}
	
	@Override
	public void setupGame() {
		this.initializeTileMap();
		int worldWidth = 600;
		int worldHeight = 600;
		
		player = new Player(this);
		addGameObject(player, startX - player.getWidth() / 2, startY - player.getHeight() / 2);
		View view = new View(worldWidth, worldHeight);

		setView(view);
		size(worldWidth, worldHeight);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	private void initializeTileMap() {
        // Load Sprites
        Sprite floorSprite = new Sprite(this.MEDIA_URL.concat("GroundGravel_Concrete.png"));
        Sprite crateSprite = new Sprite(this.MEDIA_URL.concat("CrateDark_Gray.png"));
        Sprite wallSprite = new Sprite(this.MEDIA_URL.concat("Wall_Gray.png"));
        // Create tile types with the right Tile class and sprite
        TileType<FloorTile> floorTileType = new TileType<>(FloorTile.class, floorSprite);
        TileType<CrateTile> crateTileType = new TileType<>(CrateTile.class, crateSprite);
        TileType<WallTile> wallTileType = new TileType<>(WallTile.class, wallSprite);
        TileType[] tileTypes = {floorTileType, crateTileType, wallTileType};
        int tileSize = 60;
        int tilesMap[][] = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 1, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
    }
	
}
