public class AveragePCMMarks {
    public static void main(String[] args) {
        String name = "Sam";
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalSubjects = 3;
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / totalSubjects;
        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}