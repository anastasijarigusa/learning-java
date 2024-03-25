package homework;

public class PezDispenser {
    private String name;
    private String color;
    private String model;
    private final int MAX_AMOUNT = 20;
    private int currentAmount;

    public PezDispenser(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.currentAmount = MAX_AMOUNT;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    //Task 1: PezDispenser gives 1 sweet at a time
    public void give() {
        if (getCurrentAmount() <= 0) {
            System.out.println("Not enough sweets! Please refill.");
        } else {
            System.out.println("Have a nice meal!");
            currentAmount--;
        }
    }

    //Task 2: PezDispenser gives a certain amount of sweets at a time
    public void give(int amountCount) {
        if (amountCount > currentAmount) {
            System.out.println("Only " + currentAmount + " of 20 sweets are in Pez");
        } else {
            currentAmount = currentAmount - amountCount;
            System.out.println("You took " + amountCount + " sweets");
        }
    }

    //Task 3: Fill Pez completely
    public void fullFill() {
        currentAmount = MAX_AMOUNT;
        System.out.println("Pez is filled up!");
    }

    //Task 4: Fill Pez by 1 sweet at a time
    public void fill() {
        if (getCurrentAmount() >= MAX_AMOUNT) {
            System.out.println("You can put only 20 sweets");
        } else {
            System.out.println("+1 sweet :)");
            currentAmount++;
        }
    }

    //Task 5: Fill Pez by a certain amount
    public void fill(int amountCount) {
        if (currentAmount + amountCount > MAX_AMOUNT) {
            System.out.println("You can not fill more than 20 sweets");
        } else {
            currentAmount = currentAmount + amountCount;
            System.out.println("You added " + amountCount + " sweets :)");
        }
    }
}