import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static Random r = new Random();

    public static double inchesToMm(double inches){
        return inches * 25.4;
    }

    public static double last3YearsInInches(ArrayList<Double> data){
        int x = data.size();
        if (x < 3) {
            return 100;
        }
        return (data.get(x-1) + data.get(x-2) + data.get(x-3))/3;
    }

    public static void fire(Tree tree, ArrayList<Double> data){
        double rainfall = last3YearsInInches(data);
        if(rainfall < 0.5){
            System.out.println("Oh no we had a fire!");
            tree.setMyChar('|');
        }else{
            tree.setMyChar('V');
        }
    }

    public static double inchesRain(ArrayList<Double> data){
        double randomNumber = r.nextDouble()*2;
        data.add(randomNumber);
        return randomNumber;
    }

    public static void main(String[] args) {
        Tree tree = new Tree(0);
        ArrayList<Double> inchesRainFallList = new ArrayList<>();
        for(int year = 1; year <= 20; year++){
            System.out.println("Year: " + year );
            double inchesRainFall = inchesRain(inchesRainFallList);
            double rainFallInMm = inchesToMm(inchesRainFall);
            System.out.println("Rain this year: " + inchesRainFall + " inches or " + rainFallInMm + " mm");
            tree.grow(rainFallInMm);
            tree.draw();
            fire(tree, inchesRainFallList);
        }


    }
}