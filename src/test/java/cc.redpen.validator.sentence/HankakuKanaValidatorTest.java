package cc.redpen.validator.sentence;


import java.util.List;
import cc.redpen.ValidationError;
import cc.redpen.model.Sentence;
import cc.redpen.validator.sentence.HankakuKanaValidator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class HankakuKanaValidatorTest {
    @Test
    public void testWithLongSentence() {
        HankakuKanaValidator validator = new HankakuKanaValidator();
        Sentence str = new Sentence("この文には半角カナがはいっているんﾀﾞﾅ", 0);
        List<ValidationError> error = validator.validate(str);
        assertNotNull(error);
        assertEquals(1, error.size());
    }
}
