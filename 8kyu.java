public class Kata1 // Returning Strings
{
  public static String greet(String name)
  {
    return String.format("Hello, %s how are you doing today?", name);
  }
}


public class Kata2 // Calculate average
{
  public static double find_average(int[] array){
    double average = 0;
    for(int i=0; i<array.length; i++)
      average += array[i];
    
    return average/array.length;
  }
}


public class Kata3 // Fake Binary
{
    public static String fakeBin(String numberString) {     
      char[] temp = numberString.toCharArray(); //Converting from string to char* in order to manipulate the value      
      for(int i=0; i<numberString.length(); i++){
        if(temp[i] < 53)
          temp[i] = '0';
        else
          temp[i] = '1';
      }
      numberString = String.valueOf(temp);  //Reverting back to string 
        return String.format("%s", numberString);
    }
}

public class Kata4 // Lost Without a Map
{
  public static int[] map(int[] arr) {
    for(int i=0; i<arr.length; i++)
        arr[i] *= 2;
    
    return arr;
  }
}

public class Kata5 // Reversed sequence
{
  public static int[] reverse(int n){
    int[] array = new int[n];
    for(int i= 0; i<n; i++)
        array[i] = n - i;
    
    return array;
  }
}

public class Kata6 //  hello world
{
  public static String greet(){
    return String.format("hello world!");
  }
}

public class Kata7 // Basic Mathematical Operations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    int result;
    if(op.charAt(0) == '+')
      result = v1 + v2;
    else if(op.charAt(0) == '-')
      result = v1 - v2;
    else if(op.charAt(0) == '*')
      result = v1 * v2;
    else
      result = v1 / v2;
    
    return result;
  }
}

public class Kata8  // Keep Hydrated!
{
  public int Liters(double time)  {
    return (int) Math.floor(time * 0.5);
  }
}

class Kata9 // Convert a Number to a String!
{
  public static String numberToString(int num) {
    return String.format("%s", Integer.toString(num));
  }
}

public class Kata10 // Opposites Attract
{  
  public static boolean even(final int flower){
    if((flower % 2) == 0)
      return true;
    else
      return false;
  }

  public static boolean isLove(final int flower1, final int flower2) {
    if(even(flower1) && !even(flower2))
      return true;
    else if(!even(flower1) && even(flower2))
      return true;
    else
      return false;
  } 
}

class Kata11 // Grasshopper - Personalized Message
{
    static String greet(String name, String owner) {
        if(name.equals(owner))
          return String.format("%s", "Hello boss");
        else
          return String.format("%s", "Hello guest");
    }
}

public class Kata12 // Square(n) Sum
 {
  public static int squareSum(int[] n)
  { 
    int sum = 0;
    for(int i=0; i<n.length; i++)
      sum += (n[i] * n[i]);
    return sum;
  }
 }


public class Kata13 // You only need one - Beginner
{
    public static boolean check(Object[] a, Object x) {
      for(int i=0; i<a.length; i++)
          if(a[i] == x)
            return true;
      
      return false;
    }
}


public class Kata14 // Simple multiplication
{
    public static int simpleMultiplication(int n) {
      if((n % 2)==0)
          return n * 8;
      
        return n * 9;
    }
}

public class Kata15 // Are You Playing Banjo?
{
  public static String areYouPlayingBanjo(String name) {
    if(name.charAt(0) == 'R' || name.charAt(0) == 'r')
      return String.format("%s plays banjo", name);
    
    return String.format("%s does not play banjo", name);
  }
}

class Kata16 // You Can't Code Under Pressure #1
{
  public static int doubleInteger(int i) {
    return i*2;
  }
}

public class Kata17 // How good are you really?
{
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    float ave = yourPoints;
    for(int i=0; i<classPoints.length; i++)
       ave += classPoints[i];
    
    ave /= (classPoints.length + 1);
    
    if(yourPoints > ave)
      return true;
    
    return false;
  }
}

public class Kata18 // Count by X
{
  public static int[] countBy(int x, int n){
    int[] array = new int[n]; 
    int counter = x;
    int index = 0;
    int flag = 0;
    while(flag == 0){
      if((counter % x) == 0){
        array[index] = counter;
        index++;
      }
      if(index == n)
        flag = 1;
      counter++;  
    }
    
    return array;
  }
}

public class Kata19 // Convert a Boolean to a String
{
  public static String convert(boolean b) {
    if(b == true)
      return "true";
    return "false";
  }
}

public class Kata20 // Count of positives / sum of negatives
{
    public static int[] countPositivesSumNegatives(int[] input)
    { 
      if(input == null || input.length == 0){
        int[] duo = {};
        return duo;
        }
      
      int[] duo = new int[2];
      duo[0] = 0; duo[1] = 0;
      for(int i=0; i<input.length; i++){
        if(input[i] > 0)
          duo[0]++;
        else{
          duo[1] += input[i];
        }
      }
        return duo; //return an array with count of positives and sum of negatives
    }
}

public class Kata21 // School Paperwork
{
  public static int paperWork(int n, int m) 
  {
    if(n<0 || m<0)
      return 0;
    
    return n*m;
  }
}

public class Kata22 // Transportation on vacation
{
  public static int rentalCarCost(int d) {
    if(d<3)
      return d * 40;
    else if(d<7)
      return (d*40) - 20;
    else
      return (d*40) - 50;
  }
}

class Kata23 // Remove exclamation marks
{
    static String removeExclamationMarks(String s) {
      
      String newS = s.replace("!", "");      
        return newS;     
    }
}

import java.util.List;

public class MixedSum // Sum Mixed Array
{

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
    int sum = 0;
    for(Object s: mixed){
            sum +=Integer.parseInt(s.toString());
    }
		return sum;
	}
}
