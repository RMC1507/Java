// Practicing defining methods 
public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int curentOvenTime){
        return 40 - curentOvenTime;
    }
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int curentOvenTime){
        return (layers * 2) + curentOvenTime;
    }
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        //Total time in the oven
        int ovenTime = lasagna.expectedMinutesInOven();
        System.out.println(ovenTime);

        //Curent time in the oven
        int curentOvenTime = lasagna.remainingMinutesInOven(30);
        System.out.println(curentOvenTime);

        //Total prep time, based on the amount of layers
        int layers = 3;
        int prepTime = lasagna.preparationTimeInMinutes(layers);
        System.out.println(prepTime);

        //Total time to make the Lasagna, prep time + total time in the oven
        int totalTime = lasagna.totalTimeInMinutes(3,20);
        System.out.println(totalTime);
    }
}
