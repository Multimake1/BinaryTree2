package com.company.Classes;

import com.company.Interfaces.TypeBuilder;

import java.util.HashMap;
import java.util.Set;

public class TypeFactory {
    private static HashMap<String, TypeBuilder> typeNames;

    static {
        typeNames = new HashMap<>();

        TypeBuilder typeBuilder = new IntegerBuilder();
        typeNames.put(typeBuilder.typeName().toLowerCase(), typeBuilder);

        typeBuilder = new StringBuilder();
        typeNames.put(typeBuilder.typeName().toLowerCase(), typeBuilder);
    }

    public static Set<String> getTypeNamesSet() { return typeNames.keySet(); }

    public static TypeBuilder getTypeBuilderByName(String name) { return typeNames.get(name.toLowerCase()); }
}
