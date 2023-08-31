public class Kata1 // Exes and Ohs
{  
  public static boolean getXO (String str) {
    
    int counter = 0;
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i) == 'o' || str.charAt(i) == 'O')
        counter++;
      else if(str.charAt(i) == 'x' || str.charAt(i) == 'X')
        counter--;
    }
    
    if(counter != 0)
        return false;
    else
      return true;
  }
}

class Kata2 // Is this a triangle?
{
  public static boolean isTriangle(int a, int b, int c){
    
    if((a+b)>c && (a+c)>b && (b+c)>a && a!=0 && b!=0 && c!=0)   
      return true;
    else
      return false;
  }
}

public class Kata3 // Complementary DNA
{
  public static String makeComplement(String dna) {
    
    char temp[] = dna.toCharArray();
    for(int i=0; i< dna.length(); i++){
      if(temp[i] == 'T')
        temp[i] = 'A';
      else if(temp[i] == 'A')
        temp[i] = 'T';
      else if(temp[i] == 'C')
        temp[i] = 'G';
      else if(temp[i] == 'G')
        temp[i] = 'C';
    }
    
    dna = String.valueOf(temp);
    return String.format("%s", dna);
  }
}

public class Kata4 // Mumbling
{    
    public static String accum(String s) {
    
      char[] newS = s.toCharArray();
      StringBuilder mumbling = new StringBuilder();
      
      for(int i=0; i<newS.length; i++){
        
        mumbling.append(Character.toUpperCase(newS[i]));
        for(int j=0; j<i; j++)
          mumbling.append(Character.toLowerCase(newS[i]));
        
        if(i!= (newS.length - 1))
          mumbling.append('-');
      }
        
      return mumbling.toString();
      }
}

public class Kata5 // Isograms
{
    public static boolean  isIsogram(String str) {

      char strS[] = str.toCharArray();
      char curr;
      for(int i=0; i<strS.length; i++){
        curr = strS[i];
        for(int j = i+1; j<strS.length; j++){
          if(strS[j] == Character.toLowerCase(curr) || strS[j] == Character.toUpperCase(curr))
            return false;
        }
      }
      return true;
    } 
}

public class Kata6 {

  public int squareDigits(int n) {
    // TODO Implement me
    String s = n + "";
    String[] digits = s.split("");
    String result = new String();

    for (String str : digits) {
      int curr = Integer.parseInt(str);
      result +=  curr * curr;
    }

    return Integer.parseInt(result);
  }
}
