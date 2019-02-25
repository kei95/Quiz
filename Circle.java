public class Circle{
    private double redius;
/**
 * @param
 *
 */

    public Circle(double redius){
        this.redius = redius;
    }


    public double area(){
        return Math.PI * this.redius * this.redius;
    }

    public double circumference(){
        return 2 * Math.PI * this.redius;
    }
    public double getRedius() {
        return this.redius;
    }

    public void draw(){
        System.out.println(this.area());
        System.out.println(this.circumference());
    }
}