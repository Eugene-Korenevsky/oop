package firstLab2Try.locale;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MyLocale {
    private Locale locale = new Locale("bel", "BY");
    private NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }
}
