public class WorkoutCalculator {
    public double calculate(Exercises exercise, int minutes) {
        return exercise.caloriesPerMinute() * minutes;
    }
}

