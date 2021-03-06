package by.it.akhmelev.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskA1 {

    private List<Integer> grades=new ArrayList<>(30);

    public static void main(String[] args) {
        TaskA1 instance=new TaskA1();
        for (int i = 0; i < 30; i++) {
            int grade=(int)(Math.random()*10)+1;
            instance.grades.add(grade);
        }

        System.out.println("BEFORE: "+instance.grades);
        instance.clearBad(instance.grades);
        System.out.println("AFTER:  "+instance.grades);
    }

    private void clearBad(List<Integer> grades){
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()){
            Integer currentGrade = iterator.next();
            if (currentGrade<4)
                iterator.remove();
        }
    }
}
