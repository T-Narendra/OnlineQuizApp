package IntershipTasks;

import java.util.*;
public class QuizApp {
    public static void main(String[] args) {
        Map<String, String> quizData=new HashMap<>();
        quizData.put("Java is a? \n a.food\n b.fruit\n c.drink\n d.Programming Language","d");
        quizData.put("JDK belongs to?\n a.Java\n b.C++\n c.Python\n d.C","a");
        quizData.put("Which package contains the Scanner class?\n a. java.util\n b. java.io\n c. java.lang\n d. java.scanner", "a");
        quizData.put("Which operator is used for logical AND?\n a. &\n b. &&\n c. and\n d. ||", "b");
        quizData.put("Which exception is checked at compile time?\n a. NullPointerException\n b. IOException\n c. ArithmeticException\n d. ArrayIndexOutOfBoundsException", "b");

        List<String> questions=new ArrayList<>(quizData.keySet());
        List<String> answers=new ArrayList<>(quizData.values());
        int questionIndex=0;
        Scanner s=new Scanner(System.in);
        int score=0;
        int pointsPerQuestion=10;
        System.out.println("===========WELCOME TO THE QUIZ==========");
        while(questionIndex<questions.size()){
            String question=questions.get(questionIndex);
            System.out.println(questionIndex+1+"."+question);
            System.out.println("Enter your choice:");
            String choice=s.nextLine();
            if(choice.equalsIgnoreCase(answers.get(questionIndex))){
                System.out.println("Your answer is RIGHT");
                System.out.println("-----------------------------");
                score+=pointsPerQuestion;
            }
            else{
                System.out.println("WRONG! Correct answer is "+answers.get(questionIndex));
                System.out.println("-----------------------------");
            }
            questionIndex++;
        }
        System.out.println("-----------QUIZ FINISHED-----------");
        System.out.println("Your total score is:"+score+"/50");
    }
}

