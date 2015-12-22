package com.dekvek.someApi;

import com.dekvek.exceptionGroups.*;

public class Foo {
  public static void main(String[] args) {
    try {
      sumAandB();
    } catch (PropertyException e) {
      String message =
        e.visit(PropertyExceptionVisitor
                .make(nsk -> "Cannot read key " + nsk.getKey(),
                      pso -> "System offline at " + pso.getAccessTime(),
                      pav -> "Access violation by user " + pav.getUserId()));

      sendToLogger(message);
    }
  }

  public static Integer doA() throws PropertyException {
    return null;
  }

  public static Integer doB() throws PropertyException {
    return null;
  }

  public static Integer sumAandB() throws PropertyException {
    return doA() + doB();
  }

  public static void sendToLogger(String message) {
    return;
  }
}
