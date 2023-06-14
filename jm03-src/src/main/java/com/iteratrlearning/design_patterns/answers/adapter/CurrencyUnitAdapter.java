package com.iteratrlearning.design_patterns.answers.adapter;

import java.util.Currency;
import java.util.Locale;

public class CurrencyUnitAdapter implements CurrencyUnit {

    private Currency currency;

    public CurrencyUnitAdapter(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getCode() {
        return currency.getCurrencyCode();
    }

    @Override
    public String getSymbol(Locale locale) {
        return currency.getSymbol(locale);
    }
}
