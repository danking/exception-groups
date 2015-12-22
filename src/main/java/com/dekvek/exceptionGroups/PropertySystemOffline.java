package com.dekvek.exceptionGroups;

import java.util.*;

public class PropertySystemOffline extends PropertyException {

  private final String url;
  private final Calendar accessTime;

  private PropertySystemOffline(String url, Calendar accessTime) {
    this.url = url;
    this.accessTime = accessTime;
  }

  public static PropertySystemOffline make(String url, Calendar accessTime) {
    return new PropertySystemOffline(url, accessTime);
  }

  public <T> T visit(PropertyExceptionVisitor<T> v) {
    return v.visit(this);
  }

  public String getUrl() {
    return this.url;
  }

  public Calendar getAccessTime() {
    return this.accessTime;
  }

}
