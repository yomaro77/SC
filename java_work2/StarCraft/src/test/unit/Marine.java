package test.unit;

import test.kind.Terran;

public class Marine {
	
	private String name = "마린";
	public static int hp = 40;
	public static int attack = 6 + Terran.attackPlus;
	public static int defense = 0 + Terran.defensePlus;
	public static int intersection = 2;
	private float speed = 1.875f;
	private int price = 50;
	public static int currentLoc = 0; //시작 위치 0
	

	public void test() {
		System.out.println(this.currentLoc + this.intersection);
	}
	
	public void atk() {
		//(마린 현재위치 + 마린 사거리) 또는 (마린 현재위치 + 마린사거리 -1)와 (저글링 현재위치)와 같거나 같은 자리에 있으면 공격
		if((this.currentLoc + this.intersection) == Zergling.currentLoc || (this.currentLoc + this.intersection) - 1 == Zergling.currentLoc || this.currentLoc == Zergling.currentLoc) {

			//저글링 생명력 + 방어력 합쳐서 변수 zg에 저장
			int zg = Zergling.hp + Zergling.defense;
			//마린 생명력에 저글링 공격력 빼기
			zg -= this.attack;
			
			System.out.println("저글링을 공격했습니다.");
			System.out.println(this.attack - Zergling.defense + "의 공격 효과가 있었습니다.");
			System.out.println("마린 생명력: " + Zergling.hp + " > " + zg);
			
			//생명력 깎임 출력을 위해 출력 후 마린 깎인 생명력 값 전달
			Zergling.hp = zg;

		} else {

			System.out.println("저글링이 사거리 안에 없습니다.");
			System.out.println("저글링 현재위치: " + Marine.currentLoc
								+ "내(마린) 현재위치: " + this.currentLoc);

		}
		System.out.println(); //엔터
	}
	
	public void moveLR(int left, int right) {
		//현재 위치가 0미만 9초과 불가능, 저글링 오른쪽으로 이동 불가
		if((this.currentLoc - left) >= 0 && (this.currentLoc + right) <= 9 && (this.currentLoc + right) <= Zergling.currentLoc) {

			if(left <= 1 && right == 0) {
				this.currentLoc -= left;
				System.out.println(this.name + "이 왼쪽으로 " + left + "칸 움직였습니다.");
				
			} else if(left == 0 && right <= 1) {
				this.currentLoc += right;
				System.out.println(this.name + "이 오른쪽으로 " + right + "칸 움직였습니다.");
				
			} else {
				System.out.println("1턴에 좌나 우로 최대 1칸만 움직일 수 있습니다.");
				System.out.println("좌, 우 둘 중 하나만 입력해주세요.");

			}

		} else if((this.currentLoc + right) >= Zergling.currentLoc){
			System.out.println("저글링 오른쪽으로는 이동 할 수 없습니다.");
		} else if((this.currentLoc - left) <= 0) {
			System.out.println("0 밑으로는 이동 불가합니다.");
		} else if((this.currentLoc + right) >= 9) {
			System.out.println("9 위로는 이동 불가합니다.");
		}

		System.out.print(this.name + " 현재위치 : " + this.currentLoc);
		switch (this.currentLoc) {
		case 0:
			System.out.println(" [*---------]");
			break;
		case 1:
			System.out.println(" [-*--------]");
			break;
		case 2:
			System.out.println(" [--*-------]");
			break;
		case 3:
			System.out.println(" [---*------]");
			break;
		case 4:
			System.out.println(" [----*-----]");
			break;
		case 5:
			System.out.println(" [-----*----]");
			break;
		case 6:
			System.out.println(" [------*---]");
			break;
		case 7:
			System.out.println(" [-------*--]");
			break;
		case 8:
			System.out.println(" [--------*-]");
			break;
		case 9:
			System.out.println(" [---------*]");
			break;

		default:
			break;
		}

		System.out.println(); //엔터
	}
	
	public void status() {
		System.out.println( "이름: " + this.name
							+ "\n생명력: " + this.hp
							+ "\n공격력: " + this.attack + "(+" + Terran.attackPlus + ")"
							+ "\n방어력: " + this.defense + "(+" + Terran.defensePlus + ")"
							+ "\n스피드: " + this.speed
							+ "\n가격: " + this.price
							+ "\n현재위치: " + this.currentLoc + "\n");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

}
