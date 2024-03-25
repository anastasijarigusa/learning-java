package homework;

public class PlayPezDispenser {
    public static void main(String[] args) {
        PezDispenser spiderMan = new PezDispenser("SpiderMan", "black", "Marvel");
        System.out.println(spiderMan.getName());
        System.out.println(spiderMan.getColor());
        System.out.println(spiderMan.getModel());
        System.out.println(spiderMan);

        //Task 1: PezDispenser gives 1 sweet at a time
        System.out.println(" ");
        System.out.println("Task 1");
        spiderMan.give();
        spiderMan.give();
        spiderMan.give();
        spiderMan.give();
        spiderMan.give();
        System.out.println("Current amount: " + spiderMan.getCurrentAmount());

        //Task 2: PezDispenser gives a certain amount of sweets at a time
        System.out.println(" ");
        System.out.println("Task 2");
        spiderMan.give(21);
        System.out.println("Current amount: " + spiderMan.getCurrentAmount());

        //Task 3: Fill Pez completely
        System.out.println(" ");
        System.out.println("Task 3");
        spiderMan.fullFill();
        System.out.println("Current amount: " + spiderMan.getCurrentAmount());

        //Task 4: Fill Pez by 1 sweet at a time
        System.out.println(" ");
        System.out.println("Task 4");
        spiderMan.give();
        spiderMan.give();
        spiderMan.give();
        spiderMan.give();
        spiderMan.give();
        spiderMan.fill();
        System.out.println("Current amount: " + spiderMan.getCurrentAmount());

        //Task 5: Fill Pez by a certain amount
        System.out.println(" ");
        System.out.println("Task 5");
        spiderMan.fill(4);
        System.out.println("Current amount: " + spiderMan.getCurrentAmount());


    }


}
