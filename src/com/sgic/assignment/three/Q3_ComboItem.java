package com.sgic.assignment.three;

public class Q3_ComboItem {
    private String key;
    private int value;

    public Q3_ComboItem(String key, int value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public int getValue()
    {
        return value;
    }
}
