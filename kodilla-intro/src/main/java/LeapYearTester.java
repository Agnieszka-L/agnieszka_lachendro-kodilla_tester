public class LeapYearTester {
    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        boolean leap2040 = year.isLeap(2040);
        boolean leap100 = year.isLeap(100);
        boolean leap2000 = year.isLeap(2000);
        boolean leap400 = year.isLeap(400);


        System.out.println("leap2040 = " + leap2040);
        System.out.println("leap100  = " + leap100);
        System.out.println("leap2000  = " + leap2000);
        System.out.println("leap400  = " + leap400);
    }
}