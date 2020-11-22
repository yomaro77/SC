package test.kind;

public class Zerg {

	private String name = "저그";
	private static int money = 100;
	
	public static int attackPlus = 0;
	public static int defensePlus = 0;
	
	public static void atkUpgrade() {
		if(attackPlus <= 3) {
			if(attackPlus == 0 && money >= 80) {
				attackPlus += 1;
				money -= 100;
				System.out.println("공격력 업그레이드 완료, 현재 공격력: " + attackPlus);
			} else if(attackPlus == 1 && money >= 120) {
				attackPlus += 1;
				money -= 150;
				System.out.println("공격력 업그레이드 완료, 현재 공격력: " + attackPlus);
			} else if(attackPlus == 2 && money >= 180) {
				attackPlus += 1;
				money -= 200;
				System.out.println("공격력 업그레이드 완료, 현재 공격력: " + attackPlus);
			} else {
				System.out.println("업그레이드 비용이 부족합니다.");
				System.out.println("1: 80원, 2: 120원, 3: 180원 필요");
			}
		} else {
			System.out.println("공격력 업그레이드가 최대치 입니다.");
			System.out.println("현재 공격력: " + attackPlus);
		}
		System.out.println(); //엔터
	}

	public static void defUpgrade() {
		if(defensePlus <= 3) {
			if(defensePlus == 0 && money >= 80) {
				defensePlus += 1;
				money -= 100;
				System.out.println("방어력 업그레이드 완료, 현재 방어력: " + defensePlus);
			} else if(defensePlus == 1 && money >= 120) {
				defensePlus += 1;
				money -= 150;
				System.out.println("방어력 업그레이드 완료, 현재 방어력: " + defensePlus);
			} else if(defensePlus == 2 && money >= 180) {
				defensePlus += 1;
				money -= 200;
				System.out.println("방어력 업그레이드 완료, 현재 방어력: " + defensePlus);
			} else {
				System.out.println("업그레이드 비용이 부족합니다.");
				System.out.println("1: 80원, 2: 120원, 3: 180원 필요");
			}
		} else {
			System.out.println("방어력 업그레이드가 최대치 입니다.");
			System.out.println("현재 방어력: " + defensePlus);
		}
		System.out.println(); //엔터
	}
	
}
