PROGRAM 2.1 — MathUtil.java
  
package com.scsvmv.util;

 public class MathUtil {
     public static int square(int n) { return n * n; }
     public static int cube(int n)   { return n * n * n; }
 }

PROGRAM 2.2 — UseMath.java
  
 import com.scsvmv.util.MathUtil;

 public class UseMath {

      public static void main(String[] args) {
          System.out.println("Square of 7 = " + MathUtil.square(7));
          System.out.println("Cube   of 3 = " + MathUtil.cube(3));
      }
 }
