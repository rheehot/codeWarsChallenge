package codeWars.kyu7.rowWeight_20201004;

public class Solution {

  public static int[] rowWeights(final int[] weights) {
    int[] result = new int[2];
    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        result[0] += weights[i];
      } else {
        result[1] += weights[i];
      }
    }
    return result;
  }
}
