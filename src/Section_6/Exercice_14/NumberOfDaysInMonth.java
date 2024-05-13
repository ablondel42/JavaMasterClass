package Section_6.Exercice_14;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if ((year > 0 && year < 10000) && (month > 0 && month < 13)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 4, 6, 9, 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
            }
        }
        return -1;
    }
}
