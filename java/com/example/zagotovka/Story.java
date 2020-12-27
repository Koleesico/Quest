package com.example.zagotovka;

public class Story  {
    public Situation current_situation;
    private Situation start_story;
    Story() {
        start_story = new Situation("Заголовок", "1) вариант 1\n" +
                                                           "2) вариант  2", 2, 0, 0);
        start_story.direction[0] = new Situation("Заголовок 1", "1) вариант 1.1\n" +
                                                                          "2) вариант  2.1", 2, 1, 1);
              start_story.direction[0].direction[0] = new Situation("Заголовок 1.1", "1) вариант 1.1.1\n" +
                                                                                               "2) вариант  1.1.2", 0, 2, -2);
              start_story.direction[0].direction[1] = new Situation("Заголовок 1.2",  "1) вариант 1.2.1\n" +
                                                                                                "2) вариант  1.2.2", 0, -2, 2);
        start_story.direction[1] = new Situation("Заголовок 2", "1) вариант 2.1\n" +
                                                                          "2) вариант 2.2", 2, 1, 1);
              start_story.direction[1].direction[0] = new Situation("Заголовок 2.1","1) вариант 2.1.1\n" +
                                                                                              "2) вариант 2.1.2", 0, -2, 3);
              start_story.direction[1].direction[1] = new Situation("Заголовок 2.2","1) вариант 2.2.1\n" +
                                                                                              "2) вариант 2.2.2",  0, 1, -1);



        current_situation=start_story;
    }
    public void go(int num){

            current_situation = current_situation.direction[num - 1];
    }

    public boolean isEnd(){
        return current_situation.direction.length == 0;
    }
}
