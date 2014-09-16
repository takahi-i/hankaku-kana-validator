package cc.redpen.validator.sentence;

import cc.redpen.ValidationError;
import cc.redpen.model.Sentence;
import cc.redpen.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class HankakuKanaValidator extends Validator<Sentence> {

    private static String HANKAKU_KANA_PATTERN =  ".*[\\uFF65-\\uFF9F\\s-].*";

    public List<ValidationError> validate(Sentence sentence) {
        List<ValidationError> errors = new ArrayList<>();
        if (sentence.content.matches(HANKAKU_KANA_PATTERN)) {
            errors.add(new ValidationError(this.getClass(), "Found hankaku kana character", sentence));
        }
        return errors;
    }
}
