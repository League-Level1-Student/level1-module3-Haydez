import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class world {
public static void main(String[] args) {
	World w = new World();
	w.show();
	Bug b = new Bug();
	Flower f = new Flower();
	Flower f1 = new Flower();
	Location l = new Location(5, 5);
	Location l1 = new Location(5, 6);
	Location l2 = new Location(5, 4);
	w.add(l, b);
	w.add(l1, f);
	w.add(l2, f1);
	w.add(l, b);
	b.setDirection(90);
}
}
