package hw.day12;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.EmailValidator;
import org.junit.jupiter.api.Test;

public class AssertMaven {


    @Test
    public void testEmail(){
        String email = "myNamee@xample.com";
        boolean valid = EmailValidator.getInstance().isValid(email);
        assertTrue(valid);
    }

    @Test
    public void testWeight() {
        double weight = 55.5;
        assertThat(weight).isNotNull()
                .isGreaterThan(0);
    }

    @Test
    public void testIdentityNumber(){
       String[] identityNo = {"000909093", "934819804", "1900109332484", "D9933399999", "091122234" };
        for (String s : identityNo) {
            try {
                assertThat(s.length()).isIn(9, 12);
                assertThat(s).containsOnlyDigits();
            } catch (AssertionError e) {
                throw new AssertionError("Identity number is not correct: " + s + " " + e.getMessage());
            }

        }
    }


}
