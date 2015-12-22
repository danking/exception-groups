package com.dekvek.exceptionGroups;

public abstract class PropertyException extends Exception {
  public abstract <T> T visit(PropertyExceptionVisitor<T> v);
}
