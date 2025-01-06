package Java_Hamster_Simulator;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Grain_Count extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int countGrains (int f){
	
	int a = 0;
	int i =1;
	while (i<=f) {
		
		if (grainAvailable()) {
			a = a +1;
			pickGrain();
		}
		if (stop_crash()){
			move();
			i++;
		}else{
		break;
		}
	}
	return a;
}
		
public void main() {
 schreib("Gesammelte K�rner: "+countGrains(10));  
}

boolean stop_crash(){
	if (frontIsClear()){
		return true;
	}else{
	return false;
	}
}}