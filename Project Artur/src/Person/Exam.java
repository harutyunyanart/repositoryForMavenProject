package Person;

public class Exam {
    private int examEnglish;
    private int examFrance;
    int valueExam = 0;
    public static int minVal = 20;

    public int getValueExam(int num1, int num2) {
        valueExam = num1 + num2;
        return valueExam;
    }

    public int getValueExam(int num1, int num2, int num3) {
        valueExam = num1 + num2 + num3;
        return valueExam;
    }

    public boolean isContinue(int valueExam) {
        if (valueExam < minVal) {
            return false;
        } else return true;
    }

}
