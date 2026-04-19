public class Lesson3_3 {
    public static void main(String[] args) {
        Park Attraction= new Park(1, "Gorki", "09:00-21:00",
                100, 14, 140, 2);
        System.out.println("Номер: " + Attraction.attractionId + "   Название: "
                + Attraction.name + "   Время работы: " + Attraction.openingHours + "   Цена:"
                + Attraction.price + "   Ограничения по возрасту:" + Attraction.technicalData.restrictionsAge +
                "   Ограничения по росту:" + Attraction.technicalData.restrictionsHeight +
                "   Вместимость за 1 прокат:" + Attraction.technicalData.capacity);
    }
}
//3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
// информацию об аттракционах, времени их работы и стоимости.