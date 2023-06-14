package com.iteratrlearning.design_patterns.problems.adapter;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.cglib.core.Local;

import java.util.Currency;
import java.util.Locale;

// TODO: introduce a new class which adapts a java.util.Currency to a CurrencyUnit
@Ignore
public class CurrencyUnitTest {

    @Test
    public void shouldReturnSameCode() {
        Currency fromCurrency = Currency.getInstance(Locale.US);
        // TODO: replace null with your adapter
        CurrencyUnit fromCurrencyUnit = null;
        Assert.assertEquals("USD", fromCurrencyUnit.getCode());
    }

    @Test
    public void shouldReturnSameSymbol() {
        Currency fromCurrency = Currency.getInstance(Locale.US);
        // TODO: replace null with your adapter
        CurrencyUnit fromCurrencyUnit = null;
        Assert.assertEquals("$", fromCurrencyUnit.getSymbol(Locale.US));
    }

}
