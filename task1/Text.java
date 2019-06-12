package by.htp.oop.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private List<Sentence> text = new ArrayList<>();
     private String hidder;


     public void buildText (){
     text.add(new Sentence());

    }
    public String getHidder() {
        return hidder;
    }

    public String setHidder(String hidder) {
        this.hidder = hidder;
        return hidder;
    }

    public List<Sentence> getText (){
        return text;

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(text);
    }
}
