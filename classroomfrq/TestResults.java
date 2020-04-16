package classroomfrq;

import java.util.ArrayList;

public class TestResults {

    private ArrayList<StudentAnswerSheet> sheets;
    
    public TestResults(ArrayList<StudentAnswerSheet> list){
        sheets = list;
    }

    public String highestScoringStudent(ArrayList<String> key){

        double highestScore = sheets.get(0).getScore(key);
        //alternatively: double highestScore = Integer.MAX;
        int highestScoreIndex = 0;
        StudentAnswerSheet student;

        for(int i = 1; i < key.size(); i++){
            student = sheets.get(i);

            if(student.getScore(key) > highestScore){
                highestScore = student.getScore(key);
                highestScoreIndex = i;
            }
        }

        return sheets.get(highestScoreIndex).getName();
    } 
}