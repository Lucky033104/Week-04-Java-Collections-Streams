package Generic;

import java.util.*;
abstract class JobRole {
    private String candidateName;
    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public abstract String evaluate();
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }
    public String evaluate() {
        return "Evaluated for Java, DSA, System Design";
    }
}
class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }
    public String evaluate() {
        return "Evaluated for Python, ML, Statistics";
    }
}
class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }
    public String evaluate() {
        return "Evaluated for Strategy, Communication, Product Sense";
    }
}
class Resume<T extends JobRole> {
    private T jobRole;
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    public void process() {
        System.out.println("Candidate: " + jobRole.getCandidateName());
        System.out.println("Screening Result: " + jobRole.evaluate());
    }
    public T getJobRole() {
        return jobRole;
    }
}
class ScreeningEngine {
    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.process();
            System.out.println("----------");
        }
    }
    public static <T extends JobRole> Resume<T> generateResume(T jobRole) {
        return new Resume<>(jobRole);
    }
}
public class ResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = ScreeningEngine.generateResume(new SoftwareEngineer("Bhaskar"));
        Resume<DataScientist> r2 = ScreeningEngine.generateResume(new DataScientist("Raja"));
        Resume<ProductManager> r3 = ScreeningEngine.generateResume(new ProductManager("Lucky"));
        List<Resume<? extends JobRole>> resumes = Arrays.asList(r1, r2, r3);
        System.out.println("AI-Driven Resume Screening Pipeline\n");
        ScreeningEngine.screenResumes(resumes);
    }
}

