package by.htp.oop.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

 Sentence sentence1 = new Sentence();

 Sentence sentence2 = new Sentence();

 Text text = new Text();

  Word[] word1 = new Word [3];

        Word w1    = new Word("Задачи  ");
        word1[0] = w1;

        Word w2 = new Word("сложно ");
        word1[1] = w2;

        Word w3 = new Word("решаются. ");
        word1 [2] = w3;

        sentence1.buildSentence(word1);

        Word[] word2 = new Word [3];

        Word w4    = new Word("Но ");
        word2[0] = w4;

        Word w5 = new Word("сдаваться ");
        word2[0] = w5;

        Word w6 = new Word("нельзя)");
        word2[0] = w6;

        sentence2.buildSentence(word2);

        text.getText();
        text.setHidder("Text");

   List <Sentence> textAll =  text.getText();
   textAll.add(sentence1);
   textAll.add(sentence2);

        System.out.println(text.getHidder());






        }
    }

