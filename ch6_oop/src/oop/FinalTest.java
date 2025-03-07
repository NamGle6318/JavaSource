package oop;

// final

public class FinalTest {
    int x = 1;
    int y = x;

    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // LV = 20;
    }
}
// class Test extends FinalTest{} (FinalTest : final = 상속 금지)

class Test extends FinalTest {

}
