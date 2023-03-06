/**
 * 
 * SYSC2004 Lab 8 
 * Limited Counter implementation 
 * 
 * @author James Runtas
 * @version March 6th 2023
 * * Student Number 101109175
 */

 public class LimitedCounter extends Counter
 {
     /**
      * Constructs a new LimitedCounter whose current count is
      * initialized to DEFAULT_MINIMUM, and which counts between
      * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
      */
     public LimitedCounter()
     {
         super();
     }
 
     /**
      * Constructs a new LimitedCounter whose current count is
      * initialized to minCount, and which counts between
      * minCount and maxCount, inclusive.
      */
     public LimitedCounter(int minCount, int maxCount)
     {
         super(minCount, maxCount);
     }
 
    
     /**
      * Increment this counter by 1.
      */
     public void countUp()
     {
         // If we've reached the maximum count, invoking this
         // method doesn't change the state of the counter.
         if (!super.isAtMaximum()) {
             super.countUp();
         }
     }
 }
 