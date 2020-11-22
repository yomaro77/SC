package test.main;

import test.kind.Terran;
import test.unit.Marine;
import test.unit.Zergling;

public class War {
	public static void main(String[] args) {
		Marine mr = new Marine();
		Zergling zg = new Zergling();


		zg.moveLR(3, 0);
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		mr.atk();
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		mr.moveLR(0, 1);
		zg.moveLR(0, 3);
		

		
	}
}
