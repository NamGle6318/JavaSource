package inter;

// 클래스 관계
// 일반 : Fighter - Unit(상속) / Fightable(구현)
// 인터페이스 : Fightable - Movable, Attackable (상속)

public class FighterEx {
    public static void main(String[] args) {

        Fighter fighter = new Fighter();
        Fightable Fightable = new Fighter();
    }
}
