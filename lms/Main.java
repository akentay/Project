package lms;

public class Main {
    public static void main(String[] args) {
        // MathCourse with MentorSupport + Certificate
        Course mathCourse = new MathCourse();
        mathCourse = new MentorSupportDecorator(new CertificateDecorator(mathCourse));

        // ProgrammingCourse with Gamification
        Course programmingCourse = new ProgrammingCourse();
        programmingCourse = new GamificationDecorator(programmingCourse);

        // Use Facade
        StudentPortalFacade portal = new StudentPortalFacade();

        System.out.println("=== Enrolling in Math Course ===");
        portal.enrollInCourse(mathCourse);

        System.out.println("\n=== Enrolling in Programming Course ===");
        portal.enrollInCourse(programmingCourse);
    }
}
