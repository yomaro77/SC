package test.main;

import test.kind.Terran;
import test.unit.Marine;
import test.unit.Zergling;

public class War {
	public static void main(String[] args) {
		Marine mr = new Marine();
		Zergling zg = new Zergling();

		// 좌우 움직이기 : moveLR(좌, 우)
		// 공격하기 : atk()

		zg.moveLR(3, 0);
		mr.moveLR(0, 1);
		

		
	}
}
