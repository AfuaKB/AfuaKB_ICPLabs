import java.util.Scanner;

public class MonitoringIO {

    public MonitoringIO() {



    }

    public static void main(String[] args){

        System.out.println("Enter observatory data");
        Scanner obs = new Scanner(System.in);

        System.out.println("Enter galamsey data");
        Scanner gal = new Scanner(System.in);

        System.out.println("Provide monitoring statistics on the largest average" +
                "galamsey, largest galamsey ever and all galamsey with colour value" +
                "greater than a given number");
        Scanner monitor = new Scanner(System.in);

        System.out.println("Exit");
        Scanner ex = new Scanner(System.in);

    }

}
