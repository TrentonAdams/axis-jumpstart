package com.example.ws2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * Created :  16/05/13 7:27 PM MST
 * <p/>
 * Modified : $Date$ UTC
 * <p/>
 * Revision : $Revision$
 *
 * @author Trenton D. Adams
 */
public class Countries
{
    private List<String> countries;

    public Countries()
    {
        countries = new ArrayList<String>();
        countries.add("Canada");
        countries.add("United States of America");
        countries.add("Britain");
        countries.add("France");
        countries.add("Russia");
    }

    public List<String> getCountries()
    {
        return Collections.unmodifiableList(countries);
    }

    public List<String> searchCountries(final String pattern)
    {
        final List<String> foundCountries = new ArrayList<String>(5);
        for (final String city : countries)
        {
            if (city.matches(pattern))
            {
                foundCountries.add(city);
            }

        }
        return foundCountries;
    }

    public String testError(final String errorTest)
    {
        throw new IllegalArgumentException(
            errorTest + " is an invalid value for errorTest");
    }
}
