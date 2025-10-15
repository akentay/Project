package lms;

public class MentorSupportDecorator extends CourseDecorator {
    public MentorSupportDecorator(Course course) {
        super(course);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addMentorSupport();
    }

    private void addMentorSupport() {
        System.out.println("👩‍🏫 Mentor support added to this course.");
    }
}
