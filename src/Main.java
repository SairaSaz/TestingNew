public class Main {
    public static void main(String[] args) {
        Dog sharik = new Dog("Шарик");
        Dog rex = new Dog("Рекс");

        Cat murzik = new Cat("Мурзик");
        Cat barsik = new Cat("Барсик");
        Cat korcik = new Cat("Корсик");

        System.out.println("БЕГ И ПЛАВАНИЕ");

        sharik.run(150);
        rex.run(600);
        sharik.swim(5);
        sharik.swim(15);

        System.out.println();

        murzik.run(150);
        barsik.run(250);
        korcik.run(100);
        murzik.swim(5);

        System.out.println(" Показатели");


        System.out.println("Создано собак: " + Dog.dogCount);
        System.out.println("Создано котов: " + Cat.catCount);
        System.out.println("Всего животных: " + Animal.animalCount);


        System.out.println("КОТЫ И МИСКА С ЕДОЙ");

        Cat[] cats = {murzik, barsik, korcik};
        Bowl bowl = new Bowl(10);
        System.out.println("Создана миска с " + bowl.getFoodAmount() + " едой");
        System.out.println("Коты пытаются поесть:");
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, 15);  // каждый кот пытается съесть 10
        }

        System.out.println("            О СЫТОСТИ");
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isFull()) {
                System.out.println(cats[i].name + ": Сыт");
            } else {
                System.out.println(cats[i].name + ": Голоден");
            }
        }

        System.out.println(" ДОБАВЛЯЕМ ЕДУ");
        bowl.addFood(10);

        System.out.println("  Голодные коты едят снова:");
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isFull()) {  // если кот голоден
                cats[i].eat(bowl, 10);
            }
        }
        System.out.println("  КОНЕЧНОЕ ЗНАЧЕНИЕ СЫТОСТЬ");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name + ": " +
                    (cats[i].isFull() ? "Сыт" : "Голоден"));
        }
        System.out.println("Осталось еды в миске: " + bowl.getFoodAmount());
    }
}
