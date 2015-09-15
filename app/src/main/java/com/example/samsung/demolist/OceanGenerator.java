package com.example.samsung.demolist;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static com.example.samsung.demolist.OceanStudent.Gender.FEMALE;
import static com.example.samsung.demolist.OceanStudent.Gender.MALE;

/**
 * Created by Samsung on 14/09/2015.
 */
public class OceanGenerator{
    public List<OceanStudent> generate(){
        List<OceanStudent> students = new ArrayList<>();
        students.add(new OceanStudent("Bira", 32, MALE));
        students.add(new OceanStudent("Michel", 26, MALE));
        students.add(new OceanStudent("Gabassi", 44, MALE));
        students.add(new OceanStudent("Assange", 40, MALE));
        students.add(new OceanStudent("Felipe", 23, MALE));
        students.add(new OceanStudent("Guilherme", 31, MALE));
        students.add(new OceanStudent("Richard", 36, MALE));
        students.add(new OceanStudent("Júlio", 21, MALE));
        students.add(new OceanStudent("Cris", 25, FEMALE));
        students.add(new OceanStudent("Douglas", 25, MALE));
        students.add(new OceanStudent("Márcio", 27, MALE));
        students.add(new OceanStudent("Rogerio", 46, MALE));
        return students;
    }
}
