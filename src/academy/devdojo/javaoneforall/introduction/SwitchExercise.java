package academy.devdojo.javaoneforall.introduction;

public class SwitchExercise {
    public static void main(String[] args) {
        int day = 10;

        switch (day) {
            case 1:
                System.out.println("Weekend day");
                break;
            case 2:
                System.out.println("Business day");
                break;
            case 3:
                System.out.println("Business day");
                break;
            case 4:
                System.out.println("Business day");
                break;
            case 5:
                System.out.println("Business day");
                break;
            case 6:
                System.out.println("Business day");
                break;
            case 7:
                System.out.println("Weekend day");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
