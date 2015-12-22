package com.dekvek.exceptionGroups;

import java.util.function.*;

public interface PropertyExceptionVisitor<T> {

  public T visit(NoSuchKey x);
  public T visit(PropertySystemOffline x);
  public T visit(PropertyAccessViolation x);

  public static <T> PropertyExceptionVisitor<T> make(Function<NoSuchKey, T> a,
                                                     Function<PropertySystemOffline, T> b,
                                                     Function<PropertyAccessViolation, T> c
                                                     ) {
    return new PropertyExceptionVisitor<T> () {
      public T visit(NoSuchKey x) {
        return a.apply(x);
      }
      public T visit(PropertySystemOffline x) {
        return b.apply(x);
      }
      public T visit(PropertyAccessViolation x) {
        return c.apply(x);
      }
    };
  }
}
