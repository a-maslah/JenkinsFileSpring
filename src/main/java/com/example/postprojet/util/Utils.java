package com.example.postprojet.util;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utils {
    /** map List to List **/
    public static <T, U> List<U> map(ModelMapper mapper, final Collection<T> source, final Class<U> destType) {

        final List<U> dest = new ArrayList<>();

        for (T element : source) {
            dest.add(mapper.map(element, destType));
        }

        return dest;
    }
}
