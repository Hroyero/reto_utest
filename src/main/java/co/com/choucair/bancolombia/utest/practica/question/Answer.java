package co.com.choucair.bancolombia.utest.practica.question;

import co.com.choucair.bancolombia.utest.practica.userinterface.UtestAnswer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question {
    private String question;
    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
    String textRegisterUser = Text.of(UtestAnswer.REGISTERED_USER).viewedBy(actor).asString();
    if(question.equals(textRegisterUser)){
        result = true;
    }else{
        result =  false;
    }
        return result;
    }
}
