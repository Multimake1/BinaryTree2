package com.company.Classes;

import com.company.Interfaces.TypeBuilder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.stream.Collectors;

public class IntegerBuilder implements TypeBuilder {
    @Override
    public String typeName() {
        return "Integer";
    }

    @Override
    public Integer create() {
        return new Random().nextInt(10000000) + 1;
    }

    @Override
    public Integer read(InputStream in) {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(in))
                .lines().collect(Collectors.joining("\n")));
    }

    @Override
    public com.company.Interfaces.Comparator getComparator() {
        return (o1, o2) -> (Integer)o1 - (Integer)o2;
    }
}

