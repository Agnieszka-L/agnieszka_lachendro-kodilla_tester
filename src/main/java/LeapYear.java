
public class LeapYear {

    public boolean isLeap(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeap2(int year)
    {
        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 != 0) {
            return true;
        }

         if (year % 400 != 0) {
             return false;
         }
         return true;
    }

    public boolean isLeap3(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

    }

}
