package Java_Hamster_Simulator;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Aufgabe_Nr_2_09_09_24 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	while (!rightClear()) {
		if (frontIsClear()) {
			move();
		}else{
		turnLeft();
		move();
		while (!rightClear()){
			move();
		}
		turnRight();
		move();
		}
	}
	turnBack();
	move();
	turnBack();
}
	
void up() {
	turnLeft();
	move();
}

boolean rightClear() {
	turnRight();
	if (frontIsClear()) {
		turnLeft();
		return true;
	}
	else {
		turnLeft();
		return false;
	}
}

void turnRight() {
	turnLeft();
	turnLeft();
	turnLeft();
}

void goToWall() {
	while (frontIsClear()) {
		move();
	}
}

void turnBack(){
	turnLeft();
	turnLeft();
}}