package com.rabo.yepp.fi.lamp;

@FunctionalInterface
public interface Switcher <T>{

    public T apply(T t);

}
