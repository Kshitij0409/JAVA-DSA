package function;

public class temperature   {
    public static double temperature(float c) {

        double f = (c*1.8) + 32;

        return f;

    }

    public static void main(String[] args) {
        System.out.println(temperature(35.67f));
    }
}


