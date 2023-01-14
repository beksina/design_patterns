package Adapter;

public class MainAdapter {
    public static void main(String[] args) {
        Turkey turk = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turk);

        // gobble will be called
        turkeyAdapter.quack();
    }
}
