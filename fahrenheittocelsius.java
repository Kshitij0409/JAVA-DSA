package function;

public class fahrenheittocelsius {
    public static double fahrenheittocelcius(float f){

        double c = (f - 32) * 0.56;

        return c;
    }

    public static void main(String[] args) {
        System.out.println( fahrenheittocelcius(55.76f));
    }
}
