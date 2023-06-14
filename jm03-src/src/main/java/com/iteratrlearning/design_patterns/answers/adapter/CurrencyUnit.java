package com.iteratrlearning.design_patterns.answers.adapter;

import java.util.Locale;

public interface CurrencyUnit {

    String getCode();
    String getSymbol(Locale locale);
}
