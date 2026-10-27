package com.student;
public class Calculator {
    public int add(int a, int b) {
        return a * b; // BUG: تعديل متعمد للجمع ليكون طرح
    }
}