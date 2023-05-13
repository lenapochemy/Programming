public class Main {
    public static void main(String[] args) {

        Human Malish = new Human("Малыш");
        Human Gunilla = new Human("Гунилла");
        Human Christer = new Human("Кристер");
        Human Mom = new Human("Мама");

        Malish.setActions(Actions.THINK);
        Gunilla.setFeatures(Features.GOODFRIEND);
        Christer.setFeatures(Features.GOODFRIEND);


        Things Table = new Things("стол");
        Things Pie = new Things("пирог");
        Things Cups = new Things("чашки");

        Dishes Dish = new Dishes("блюдо", "бутерброды");
        Dishes Vase = new Dishes("ваза", "печенье");
        Dishes Coffee_pot = new Dishes("кофейник", "горячий шоколад");

        Malish.invite(Table, Gunilla);
        Malish.invite(Table, Christer);
        Table.setFeatures(Features.FESTIVE);

        Mom.bring(Dish);
        Dish.contFeatures(Features.SMALL);
        Dish.contFeatures(Features.APPETIZING);
        Dish.contFeatures(Features.FILLING);
        Mom.bring(Vase);
        Pie.flaunt(Table);
        Pie.setFeatures(Features.BIRTHDAY);
        Mom.take(Coffee_pot);
        Mom.spill(Coffee_pot, Cups);

    }
}