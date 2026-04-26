interface Figure {
    double getArea();
    double getPerimeter();
    String getFillColor();

    String getBorderColor();

    default void printInfo() {
        System.out.println("  Площадь: " + getArea());
        System.out.println("  Периметр: " + getPerimeter());
        System.out.println("  Цвет заливки: " + getFillColor());
        System.out.println("  Цвет границы: " + getBorderColor());
        System.out.println("  -----------------------------");
    }
}

class Circle implements Figure {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle implements Figure {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}

public class Main_2 {
    public static void main(String[] args) {
        System.out.println("КРУГ");
        Circle circle = new Circle(5.0, "Красный", "Черный");
        System.out.println("  Радиус: " + circle.getRadius() + " м");
        circle.printInfo();

        System.out.println(" ПРЯМОУГОЛЬНИК");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Синий", "Черный");
        System.out.println("  Ширина: " + rectangle.getWidth() + " м");
        System.out.println("  Высота: " + rectangle.getHeight() + " м");
        rectangle.printInfo();

        System.out.println(" ТРЕУГОЛЬНИК");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Черный");
        System.out.println("  Стороны: " + triangle.getSideA() + " м, "
                + triangle.getSideB() + " м, " + triangle.getSideC() + " м");
        triangle.printInfo();
    }
}