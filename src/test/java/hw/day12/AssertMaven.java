package hw.day12;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.EmailValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertMaven {


    @Test
    public void testEmail(){
        String email = "myNamee@xample.com";
        boolean valid = EmailValidator.getInstance().isValid(email);
        assertTrue(valid);
    }

    @Test
    public void testMethod_Weight() {
        double weight = 55.5;
        assertThat(weight).isNotNull()
                .isGreaterThan(0);
    }

}
