public class TimezoneNameResolver {
    public static ZoneId resolve(String timezoneName) {
        try {
            return ZoneId.of(timezoneName);
        } catch (DateTimeException e) {
            throw new UnknownTimezoneException(timezoneName);
        }
    }
}
