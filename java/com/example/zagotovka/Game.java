package com.example.zagotovka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Game extends AppCompatActivity implements View.OnClickListener {
    TextView nameperson, paramperson, storyperson;
    Button[] btngame = new Button[2];
    //

    public static Character person;
    public static Story story;
    public static int curent ;
    String name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        nameperson = findViewById(R.id.nameperson);
        paramperson = findViewById(R.id.paramperson);
        storyperson = findViewById(R.id.storyperson);
        btngame[0] = findViewById(R.id.btn1);
        btngame[1] = findViewById(R.id.btn2);
        btngame[0].setOnClickListener(this);
        btngame[1].setOnClickListener(this);


        story = new Story();
        person = new Character( "Kate");
        nameperson.setText("Kate");
        storyperson.setText("============="
                + story.current_situation.title + "==============");
        storyperson.append("\n"+story.current_situation.text);
    }


    public void game(Story story, int curent) {
        //Scanner in = new Scanner(System.in);



        //story = new Story();
        while (true) {
            person.B += story.current_situation.dB;
            person.A += story.current_situation.dA;


            paramperson.setText("=====\nA:" + person.A + "\tB:"
                    + person.B+ "\n=====");
            storyperson.setText("============="
                    + story.current_situation.title + "==============");
            storyperson.append("\n"+story.current_situation.text);
            if (story.isEnd()) {
                // storyperson.setText("====================the end!===================");
                return;
            }
            story.go(curent);
        }

    }


    @Override
    public void onClick(View v) {
        story = new Story();
        switch (v.getId()) {
            case R.id.btn1:

                game(story, 1);
                break;
            case R.id.btn2:

                game(story, 2);
                break;
        }

    }
}




