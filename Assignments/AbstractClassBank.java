package Assignments;

     abstract class AbstractClassBank {

        abstract void denominations();
}
    class AxisBank extends AbstractClassBank {
        // provide implementation of abstract method
        public void denominations() {
            System.out.println("The denominations available in bank are: 100, 200, 500");
        }
    }
    class YesBank extends AbstractClassBank {
        public void denominations() {
            System.out.println("The denominations available in bank are: 500, 2000");
        }
    }
    class ICICIBank extends AbstractClassBank {
        // provide implementation of abstract method
        public void denominations() {
            System.out.println("The denominations available in bank are: 100, 200, 2000");
        }
    }
    class Main {
        public static void main(String[] args) {

            AxisBank axisBank = new AxisBank();
            axisBank.denominations();
            ICICIBank iciciBank = new ICICIBank();
            iciciBank.denominations();
            YesBank yesBank = new YesBank();
            yesBank.denominations();
        }
    }


