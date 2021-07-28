import taxType.*;

public class Main {
    public static void main(String[] args) {

        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();

        TaxService taxService = new TaxService();

        Bill[] payments = new Bill[] {
                new Bill(15000, incomeTaxType, taxService),
                new Bill(20000, vaTaxType, taxService),
                new Bill(35000, progressiveTaxType, taxService),
                new Bill(170000, progressiveTaxType, taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
