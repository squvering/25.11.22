public class Kata
{
  
  public static double SquareDif(double a, double b) {
    if(a > b)
      return (a - b) * (a - b);
    else
      return (b - a) * (b - a);
  }
  
  public static double Solution(int[] firstArray, int[] secondArray)
  {
    double arith = 0;
    for(int i=0; i < firstArray.Length; i++) {
      arith = (SquareDif(firstArray[i], secondArray[i]) + arith * i) / (i + 1);
    }
    
    return arith;
  }
  
}