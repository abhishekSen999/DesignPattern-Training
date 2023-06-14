package com.iteratrlearning.design_patterns.answers.adapter;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Currency;
import java.util.Locale;

@Ignore
public class CurrencyUnitTest {

    @Test
    public void shouldReturnSameCode() {
        Currency fromCurrency = Currency.getInstance(Locale.US);
        CurrencyUnit fromCurrencyUnit = new CurrencyUnitAdapter(fromCurrency);
        Assert.assertEquals("USD", fromCurrencyUnit.getCode());
    }

    @Test
    public void shouldReturnSameSymbol() {
        Currency fromCurrency = Currency.getInstance(Locale.US);
        CurrencyUnit fromCurrencyUnit = new CurrencyUnitAdapter(fromCurrency);
        Assert.assertEquals("$", fromCurrencyUnit.getSymbol(Locale.US));
    }

}
