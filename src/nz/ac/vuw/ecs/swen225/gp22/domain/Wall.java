package nz.ac.vuw.ecs.swen225.gp22.domain;

import gameImages.Img;

import java.awt.*;

/**
 * The FreeTile is a basic tile that prevents movement onto it.
 */
public class Wall extends FreeTile {
	@Override
	public boolean onMoveInto(MovingEntity e, Direction d, Cell myCell) {
		return false;
	}

	@Override
	public boolean afterMoveInto(MovingEntity e, Direction d, Cell myCell) {
		throw new IllegalStateException("Entities cannot be moved into walls!");
	}

	public String toString() {
		return "W";
	}

	public Image getImage() {
		return Img.Walltile.image;
	}
}
