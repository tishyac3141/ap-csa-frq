package classroomfrq;

import java.util.ArrayList;

public class StudentAnswerSheet {
    
    private ArrayList<String> answers; //list of student's answers
    private String name;

    public StudentAnswerSheet(ArrayList<String> ans, String ireum){
        name = ireum;
        answers = ans;
    }

    public double getScore(ArrayList<String> key){
        double score = 0.0;
        String studentAnswer;
        String correctAnswer;

        for(int i = 0; i < key.size(); i++){
            studentAnswer = answers.get(i);
            correctAnswer = key.get(i);

            if(correctAnswer == studentAnswer) score++;
            else if(studentAnswer != "?") score -= 0.25;
        }

        return score;

    }

    public double getScore2(ArrayList<String> key){
        String studentAnswer;
        String correctAnswer;

        int amountCorrect = 0;
        int amountIncorrect = 0;
        double score = 0.0;

        for(int i = 0; i < key.size(); i++){
            studentAnswer = answers.get(i);
            correctAnswer = key.get(i);

            if(correctAnswer == studentAnswer) amountCorrect++;
            else if(studentAnswer != "?") amountIncorrect++;
        }

        score = (amountCorrect) - (amountIncorrect * 0.25);
        return score;

    }

    public String getName(){
        return name;    
    }

}