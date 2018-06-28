public class Application {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Dien tich hinh chu nhat 1 la: " + rectangle1.getArea());
        System.out.println("Dien tich hinh chu nhat 2 la: " + rectangle2.getArea());
        System.out.println("Chu vi hinh chu nhat 1 la: " + rectangle1.getPerimeter());
        System.out.println("Chu vi hinh chu nhat 2 la: " + rectangle2.getPerimeter());

    }
}
