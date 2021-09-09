package com.neuedu.work.day0806;

public class EmptyStackException extends ArrayIndexOutOfBoundsException {
    public EmptyStackException(){
        super("栈为空，请处理");
    }
}
