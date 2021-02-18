package fr.sparkit.insurance.utils;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public final class DateUtils {
    private DateUtils() {
        throw new IllegalStateException("Utility Class");
    }

    public static LocalDateTime getMaxTodayDate() {
        return LocalDateTime.of(LocalDate.now(ZoneId.systemDefault()), LocalTime.MAX);
    }

    public static LocalDateTime getMinTodayDate() {
        return LocalDateTime.of(LocalDate.now(ZoneId.systemDefault()), LocalTime.MIDNIGHT);
    }

    public static LocalDateTime getSubtractedDate(LocalDateTime localDateTime, Long value, ChronoUnit unit) {
        return localDateTime.minus(value, unit);
    }


    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static DateTimeFormatter getLocalDateTimeFormatter() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    }
}
