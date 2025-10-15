package lms;

public class GamificationDecorator extends CourseDecorator {
    public GamificationDecorator(Course course) {
        super(course);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addGamification();
    }

    private void addGamification() {
        System.out.println("🏆 Gamification enabled: points and leaderboard activated!");
    }
}
