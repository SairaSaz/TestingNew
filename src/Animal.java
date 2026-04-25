public class Animal {
    public String name;
    public static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м");
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}

class Dog extends Animal {
    public static final int MAX_RUN = 500;
    public static final int MAX_SWIM = 10;
    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м. Максимум = " + MAX_RUN);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            System.out.println(name + " проплыл " + distance + "м");
        } else {
            System.out.println(name + " не может проплыть " + distance + "м. Максимум = " + MAX_SWIM);
        }
    }
}

class Cat extends Animal {
    public static final int MAX_RUN = 200;
    public static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м. Максимум = " + MAX_RUN);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.takeFood(amount);
            isFull = true;
            System.out.println(name + " поел " + amount + " еды и теперь сыт");
        } else {
            System.out.println(name + " не смог поесть (в миске недостаточно еды)");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
// Класс миска с едой
class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }

    public void addFood(int amount) {       //добавить еду
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды");
        }
    }

    public void takeFood(int amount) {//взять еду
        if (amount > 0 && amount <= foodAmount) {
            foodAmount -= amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
