package com.dregronprogram.sprite;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class SpriteAnimation {
	
	private ArrayList<BufferedImage> sprites = new ArrayList<BufferedImage>();
	
	private boolean loop = false;
	private boolean play = false;
	private boolean destroyAfterAnim = false;
	
	private int animationSpeed;
	private double xPos, yPos;
	
	public SpriteAnimation(double xPos, double yPos,int animationSpeed){
		this.animationSpeed = animationSpeed;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void draw(Graphics2D g){
		
	}
	
	public void update(double delta){
		
	}
	
	public void addSprite(BufferedImage spriteMap, int xPos, int yPos, int width, int height){
		sprites.add(spriteMap.getSubimage(xPos, yPos, width, height));
	}
	
	public void PlayerAnimation(boolean play, boolean destroyAfterAnim){
		this.play = play;
		this.destroyAfterAnim = destroyAfterAnim;
	}

}
