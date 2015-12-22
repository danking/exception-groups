package com.dekvek.exceptionGroups;

public class PropertyAccessViolation extends PropertyException {

  private final String key;
  private final String context;
  private final String userId;

  private PropertyAccessViolation(String key, String context, String userId) {
    this.key = key;
    this.context = context;
    this.userId = userId;
  }

  public static PropertyAccessViolation make(String key, String context, String userId) {
    return new PropertyAccessViolation(key, context, userId);
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

  public String getUserId() {
    return this.userId;
  }

}
