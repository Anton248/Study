package ru.nikolski.studyQA;

import static ru.nikolski.studyQA.TestingStaticMethod.StaticMethod;

/* 
Лошадь и Пегас
*/

public class Task1 {

    public static void main(String[] args) {

       int num = 0;
        num = num++;
        new SearchTests().successfulSearchTest();
        StaticMethod();

        System.out.println(num);
            }

    public class Horse {


    }

    public class Pegasus extends Horse {

    }
}
