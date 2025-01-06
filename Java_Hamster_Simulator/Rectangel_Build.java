package Java_Hamster_Simulator;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Abgabe_Valerie extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
   rectangle(5, 3);
}

void rectangle(int width, int height) {
    
    for (int i = 1; i < width; i++) {
        move();
        putGrain();
    }
    turnRight();
    
    
    for (int i = 1; i < height; i++) {
        move();
        putGrain();
    }
    turnRight();
    

    for (int i = 1; i < width; i++) {
        move();
        putGrain();
    }
    turnRight();
    

    for (int i = 1; i < height; i++) {
        move();
        putGrain();
    }
}

void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
}
}