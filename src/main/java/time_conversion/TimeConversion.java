package time_conversion;

public class TimeConversion {

    public String timeConversion(String input) {
        int hours = Integer.parseInt(input.substring(0, 2));
        String minutesSeconds = input.substring(2, 8);

        int convertedHours = convertHours(input, hours);
        String hoursText = getHoursText(convertedHours);

        return String.format("%s%s", hoursText, minutesSeconds);
    }

    private String getHoursText(int convertedHours) {
        return convertedHours < 10 ? "0" + convertedHours : "" + convertedHours;
    }

    private int convertHours(String input, int hours) {
        String amPm = input.substring(8);

        if (amPm.equals("PM") && (hours < 12))
            return hours + 12;

        if (amPm.equals("AM") && hours == 12)
            return 0;

        return hours;
    }
}
