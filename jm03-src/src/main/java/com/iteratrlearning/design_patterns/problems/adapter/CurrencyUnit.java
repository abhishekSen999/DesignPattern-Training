package com.iteratrlearning.design_patterns.problems.adapter;

import java.util.Locale;

public interface CurrencyUnit {
    String getCode();
    String getSymbol(Locale locale);
}
