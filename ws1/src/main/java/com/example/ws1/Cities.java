package com.example.ws1;

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
public class Cities
{
    private List<String> cities ;

    public Cities()
    {
        cities = new ArrayList<String>();
        cities.add("Edmonton");
        cities.add("Calgary");
        cities.add("Manitoba");
        cities.add("Toronto");
        cities.add("Vancouver");
    }

    public List<String> getCities()
    {
        return Collections.unmodifiableList(cities);
    }

    public List<String> searchCities(final String pattern)
    {
        final List<String> foundCities = new ArrayList<String>(5);
        for (final String city : cities)
        {
            if (city.matches(pattern))
            {
                foundCities.add(city);
            }

        }
        return foundCities;
    }
}
