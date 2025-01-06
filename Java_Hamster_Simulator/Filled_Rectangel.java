package Java_Hamster_Simulator;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Filled_Rectangel extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
   rectangle(5, 3);
}

void rectangle(int x, int y) {
	
	while (y > 0){
		grainLine(x);
		turnDirection(y);
		y--;
	}
}

void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
}

void turnDirection(int y) {
	
	if (y % 2 == 0){
    	turnLeft();
    	move();
    	turnLeft();
		move();

    }else{
    	
    	turnRight();
    	move();
    	turnRight();
    	move();
	}
}

void grainLine(int x) {
	for (int i = 0; i < x; i++) {
		putGrain();
		move();
    }
}}