package user.compatibility.lorenz.java.compact;


import java.util.Scanner;
 public class CompatibilityLorenzJavaCompact {
    public static void main(String[] args) {
        taskone();
        System.out.println("\n");
        tasktwo();
        }
        public static void taskone() {
            try(Scanner main0 = new Scanner(System.in)) {
                System.out.print("Enter value: ");
                String main0_1 = main0.nextLine();
                System.out.println("value inputted: " + main0_1);
        }
    }
    public static void tasktwo() {
        double main1 = 0.0;
        int main2 = 0x11;
        boolean main3 = false;
        int main4 = 1;
        int main5 = 064;
        char _main6 = 'a';
        String main7 = "noname";
        System.out.println("main1: " + main1 + " main2: " + main2 + " main3: " + main3 + " main4: " + main4 + " main5: " + main5 + " _main6: " + _main6 + " main7: " + main7);
    }
 }
