package com.lcscim.study.demo1;

public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void dscribe(){
        System.out.println("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT);
        Burrito greenChile = new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno = new Burrito(Spiciness.HOT);
        plain.dscribe();
        greenChile.dscribe();
        jalapeno.dscribe();
        System.out.println(plain.degree.ordinal());
        System.out.println(greenChile.degree.ordinal());
        System.out.println(jalapeno.degree.ordinal());
    }
}
