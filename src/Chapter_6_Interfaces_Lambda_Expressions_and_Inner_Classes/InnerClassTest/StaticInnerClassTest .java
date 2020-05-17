package Chapter_6_Interfaces_Lambda_Expressions_and_Inner_Classes.InnerClassTest;

  class StaticInnerClassTest
   {
            public static void main(String[] args)
            {
               var values = new double[20];
               for (int i = 0; i < values.length; i++)
                  values[i] = 100 * Math.random();
               ArrayAlg.Pair p = ArrayAlg.minmax(values);
               System.out.println("min = " + p.getFirst());
               System.out.println("max = " + p.getSecond());
            }
         }

         class ArrayAlg
  {
            /**
      * A pair of floating-point numbers
      */
             public static class Pair
     {
                private final double first;
                private final double second;

                /**
 32       * Constructs a pair from two floating-point numbers
 33       * @param f the first number
 34       * @param s the second number
 35       */
                public Pair(double f, double s)
                {
                   first = f;
                   second = s;
                }

                /**
 43         * Returns the first number of the pair
 44         * @return the first number
 45         */
              public double getFirst()
              {
                 return first;
              }

              /**
 52         * Returns the second number of the pair
 53         * @return the second number
 54         */
              public double getSecond()
              {
                 return second;
              }
           }

           /**
 62      * Computes both the minimum and the maximum of an array
 63      * @param values an array of floating-point numbers
 64      * @return a pair whose first element is the minimum and whose second element
 65      * is the maximum
 66      */
             public static Pair minmax(double[] values)
             {
                double min = Double.POSITIVE_INFINITY;
                double max = Double.NEGATIVE_INFINITY;
                for (double v : values)
                {
                   if (min > v) min = v;
                   if (max < v) max = v;
                }
                return new Pair(min, max);
             }
          }
