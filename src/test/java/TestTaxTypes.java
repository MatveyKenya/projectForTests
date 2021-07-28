import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taxType.IncomeTaxType;
import taxType.ProgressiveTaxType;
import taxType.VATaxType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestTaxTypes {

    @Test
    public void testIncomeTaxType(){

        double data = 100;
        double result = 13;
        IncomeTaxType taxType = new IncomeTaxType();
        double expected = taxType.calculateTaxFor(data);

        Assertions.assertTrue(expected > 0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testProgressiveTaxType(){

        double data1 = 90000;
        double result1 = 9000;
        double data2 = 100000;
        double result2 = 15000;
        ProgressiveTaxType taxType2 = new ProgressiveTaxType();

        double expected = taxType2.calculateTaxFor(data1);
        Assertions.assertEquals(expected, result1);

        expected = taxType2.calculateTaxFor(data2);
        Assertions.assertEquals(expected, result2);
    }

    @Test
    public void testVATaxType(){

        double data = 100;
        double result = 18;
        VATaxType taxType2 = new VATaxType();
        double expected = taxType2.calculateTaxFor(data);

        //использование Hamcrest
        assertThat(expected, notNullValue());
        assertThat(expected, is(equalTo(result)));
    }

}
