package Java_Hamster_Simulator;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Rekrusive_Schleife_Selbst_Programmieren_20_08_24 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	zumNaechstenFeld();
}

	void zumNaechstenFeld() {
		if (frontIsClear()){ 
			move();
			zumNaechstenFeld();
			move();
	
		}else{ 
			
			turnLeft();
			
				if (!frontIsClear()){
					turnLeftTwo();
					zumNaechstenFeld();
					turnLeft();
				
				turnRight();
		}else{
			
			zumNaechstenFeld();
		}
}
}

void turnRight() {
	turnLeft(); 
	turnLeft(); 
	turnLeft();
}

void turnLeftTwo() {
	turnLeft();
	turnLeft();
}}