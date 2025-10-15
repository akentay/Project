package lms;

public class StudentPortalFacade {
    public void enrollInCourse(Course course) {
        System.out.println("🧾 Student enrolled in course.");
        course.deliverContent();
    }

    public void startLearning(Course course) {
        System.out.println("📚 Student started learning...");
        course.deliverContent();
    }

    public void completeCourse(Course course) {
        System.out.println("✅ Course completed successfully!");
        course.deliverContent();
    }
}
