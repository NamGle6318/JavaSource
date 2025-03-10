package inter;

import java.util.Scanner;

// 클래스 : Fighter - Unit(상속) / Fightable(인터페이스)
//          Unit 
// 인터페이스 클래스 : Movable, Attackable
//                     Fightable - Movable, Attackable

public class Fighter extends Unit implements Fightable {

    // String msg;
    // Math.random();
    // Scanner sc = new Scanner(System.in);

    @Override
    public void move(int x, int y) {
    }

    @Override
    public void attack(Unit unit) {
    }

}
