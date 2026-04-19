public class Park {
public int attractionId;
public String name;
public String openingHours; //время работы
public int price;
    public class TechnicalData {
        public int restrictionsAge;       //огранич по возрасту
        public int restrictionsHeight;   //огранич по росту
        public int capacity;
        public TechnicalData ( int restrictionsAge, int restrictionsHeight, int capacity){
            this.restrictionsAge = restrictionsAge;
            this.restrictionsHeight = restrictionsHeight;
            this.capacity = capacity;}
    }
    public TechnicalData technicalData;
public Park (int attractionId, String name,String openingHours,
             int price, int restrictionsAge, int restrictionsHeight, int capacity){
    this.attractionId = attractionId;
    this.name = name;
    this.openingHours = openingHours;
    this.price = price;
    this.technicalData = new TechnicalData(restrictionsAge,restrictionsHeight,capacity);
}
}
