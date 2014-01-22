package com.example.ws2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement(name = "countries")
@XmlAccessorType(XmlAccessType.FIELD)
public class Countries
{
    private List<Country> countries;

    public Countries()
    {
        countries = new ArrayList<Country>();
        countries.add(new Country().setCountryName("Canada"));
        countries.add(new Country().setCountryName("United States of America"));
        countries.add(new Country().setCountryName("Britain"));
        countries.add(new Country().setCountryName("France"));
        countries.add(new Country().setCountryName("Russia"));
    }

    public List<Country> getCountries()
    {
        return Collections.unmodifiableList(countries);
    }

    public List<Country> searchCountries(final String pattern)
    {
        final List<Country> foundCountries = new ArrayList<Country>(5);
        for (final Country country : countries)
        {
            if (country.getCountryName().matches(pattern))
            {
                foundCountries.add(country);
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
