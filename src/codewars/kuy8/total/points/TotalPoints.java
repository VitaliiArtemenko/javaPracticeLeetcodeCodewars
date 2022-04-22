package total.points;

public class TotalPoints {

    public static int points(String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            if (game.charAt(0) > game.charAt(2)) {
                totalPoints += 3;
            } else if (game.charAt(0) == game.charAt(2)) {
                totalPoints ++;
            }
        }
        return totalPoints;
    }
}
