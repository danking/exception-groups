package com.dekvek.exceptionGroups;

public class NoSuchKey extends PropertyException {

  private final String key;
  private final String context;

  private NoSuchKey(String key, String context) {
    this.key = key;
    this.context = context;
  }

  public static NoSuchKey make(String key, String context) {
    return new NoSuchKey(key, context);
  }

  public <T> T visit(PropertyExceptionVisitor<T> v) {
    return v.visit(this);
  }

  public String getKey() {
    return this.key;
  }

  public String getContext() {
    return this.context;
  }

}
