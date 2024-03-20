package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik");
        barsik.setAge(2);
        barsik.setColour("grey");
        System.out.println(barsik.getName());


        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(3);
        leo.setColour("black");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        //Create 2 objects
        //Update info for each
        //Call walk and eat

        System.out.println(" ");

        Animal mila = new Animal();
        mila.setName("Mila");
        mila.setAge(1);
        mila.setColour("white");
        System.out.println(mila.getName());
        mila.walk();
        mila.eat();

        Animal tuzik = new Animal();
        tuzik.setName("Tuzik");
        tuzik.setAge(5);
        tuzik.setColour("ginger");
        System.out.println(tuzik.getName());
        tuzik.walk();
        tuzik.eat();

    }
}
