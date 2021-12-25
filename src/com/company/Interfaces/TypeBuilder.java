package com.company.Interfaces;

import java.io.InputStream;

public interface TypeBuilder {
    String typeName();
    Object create();
    Object read(InputStream in);
    com.company.Interfaces.Comparator getComparator();
}
