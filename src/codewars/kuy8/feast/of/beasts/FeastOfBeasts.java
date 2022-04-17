package feast.of.beasts;

public class FeastOfBeasts {
    public static boolean feastOfBeasts(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0)
                && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}
