import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        String name = null;
        try {
            Field field = cat.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(cat);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println("кота зовут " + name);




        Things Bell = new Things("звонок");
        Bell.setActions(Actions.RING);

        Human Malish = new Human("Малыш");
        Human Gunilla = new Human("Гунилла");
        Human Christer = new Human("Кристер");
        Human Mom = new Human("Мама");

        Gunilla.setActions(Actions.COME);
        Christer.setActions(Actions.COME);
        Malish.setActions(Actions.MEET);

        try {
            Malish.scream("???");
        } catch (PhraseException e){
            System.out.println(e.getMessage());
        }

        Malish.setFeatures(Features.PLEASANT);


        Malish.setActions(Actions.THINK);
        Gunilla.setFeatures(Features.GOODFRIEND);
        Christer.setFeatures(Features.GOODFRIEND);


        Things Table = new Things("стол");
        Things Pie = new Things("пирог");
        Things Cups = new Things("чашки");

        Dishes Dish = new Dishes("блюдо", "бутерброды");
        Dishes Vase = new Dishes("ваза", "печенье");
        Dishes CoffeePot = new Dishes("кофейник", "горячий шоколад");

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


        IContain pie = new IContain() {
            @Override
            public String getContent() {
                return "с зажжеными свечами";
            }
        };

        System.out.println(Pie.getName() + " " + pie.getContent());

        Mom.take(CoffeePot);
        Mom.spill(CoffeePot, Cups);

        Human.Dog Bimbo = new Human.Dog(Malish, "Бимбо");
        Bimbo.setOwner();

        Malish.setActions(Actions.WANT);


        class CartoonCharacter extends Human{

            public CartoonCharacter(String name){
                super(name);
            }
            private Actions action;
            public void come(){
                this.action = Actions.COME;
                System.out.println(getName() + " " + this.action.getActions() + " на праздник");
            }
        }
        CartoonCharacter Carlson = new CartoonCharacter("Карлсон");
        Carlson.come();

        Gunilla.sit(Table);
        Christer.sit(Table);
        Mom.treat(Dish);

        Things Basket = new Things("корзинка");
        Bimbo.put(Basket);
        Malish.sit(Table);
    }
}