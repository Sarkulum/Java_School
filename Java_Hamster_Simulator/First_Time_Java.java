package Java_Hamster_Simulator;//Valerie aka Sarkulum

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class aufgabe1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	move();		//Durch denn Move Befehl bewegt sich der Hamster ein K�stchen nach vorne.
	move3();
	
	turnLeft();		//Durch denn turnLeft Befehl dreht sich der Hamster um 90� nach Links.

	move3();

	turnRight();		//Ich habe denn turnRight Befehl am ende des codes selbst als 3 turnLeft Definiert.
	
	move6();
	
	turnRight();

	move6();

	pickGrain();		//Mit Hilfe des pickGrain Befehles nimmt man die K�rner die auf dem
	pickGrain();		//Spielfeld liegen auf.

	move();

	pickGrain();

	turnRight();

	move();

	pickGrain();

	move();

	pickGrain();
	pickGrain();
	pickGrain();
	
	turnLeft();
	turnLeft();
	
	move();
	move();
	
	turnLeft();
	
	move6();
	move();
	
	turnLeft();
	
	move6();
	
	turnLeft();
	
	move3();
	
	turnRight();
		
	move3();
	move();
	
	putGrain();		//Durch den putGrain Befehl liegt man einz der K�rner im Maul des Hamsters ab.
	putGrain();
	putGrain();
	putGrain();
	putGrain();
	putGrain();
	putGrain();
}

void move3(){
	move();
	move();
	move();
}

void move6(){
	move();
	move();
	move();
	move();
	move();
	move();
}

void turnRight(){
	turnLeft();
	turnLeft();
	turnLeft();
}}