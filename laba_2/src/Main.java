import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Nincada("Нинкада",10);
        Pokemon p2 = new Ninjask("Нинджаcк",10);
        Pokemon p3 = new Porygon("Поригон",10);
        Pokemon p4 = new Porygon2("Поригон-2", 10);
        Pokemon p5 = new PorygonZ("Поригон-z",10);
        Pokemon p6 = new Tropius("Тропиус", 10);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}
