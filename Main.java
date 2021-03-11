import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    ArrayList<Double> numbers = new ArrayList(12);
    numbers.add(15.845);
    numbers.add(37.38);
    numbers.add(12.98);
    numbers.add(98.76);
    numbers.add(67.46);
    System.out.println(findLargest(numbers));
    ArrayList<Integer> intNum = new ArrayList(10);
    intNum.add(5);
    intNum.add(5);
    intNum.add(5);
    intNum.add(10);
    intNum.add(25);
    intNum.add(12);
    intNum.add(12);
    intNum.add(12);
    intNum.add(2);
    intNum.add(1);
    removeDuplicates(intNum);
    System.out.println(intNum.toString());
    ArrayList<String> strs = new ArrayList(10);
    strs.add("four");
    strs.add("score");
    strs.add("and");
    strs.add("seven");
    strs.add("years");
    strs.add("ago");
    swapPairs(strs);
    System.out.println(strs.toString());
  }

  public static double findLargest(ArrayList<Double> a)
  {
    ArrayList<Double> newList = new ArrayList(a.size());
    int index = 0;
    for(double num: a)
    {
      newList.add(index, num);
      index++;
    }
    //double num;
    Collections.sort(newList);
    return newList.get(newList.size()-1);
  }
  public static int indexOfLargest(ArrayList<Double> a)
  {
    ArrayList<Double> newList = new ArrayList(a.size());
    int index = 0;
    for(double num: a)
    {
      newList.add(index, num);
      index++;
    }
    //double num;
    Collections.sort(newList);
    int output = 0;
    for(int i = 0; i < a.size(); i++)
    {
      if(newList.get(newList.size()-1) == a.get(i))
      {
        output = i;
        break;
      }
    }
    return output;
  }

  public static int indexOfInt(ArrayList<Integer> a, int target)
  {
    int index = 0;
    for(int number: a)
    {
      if(a.get(index) == target)
      {
        return index;
      }
      index++;
    }
    return -1;
  }

  public static boolean hasSameElements(ArrayList<Integer>  a, ArrayList<Integer>  b)
  {
    Collections.sort(a);
    Collections.sort(b);

    for(int i = 0; i < a.size(); i++)
    {
      if(a.get(i) != b.get(i))
      {
        return false;
      }
    }
    return true;
  }

  public static void removeEvenLength(ArrayList<String> a)
  {
    //Look at each string
    Iterator<String> iter = a.iterator();

    while (iter.hasNext())
    {
      String str = iter.next();

      if(str.length() % 2 == 0)
      {
        iter.remove();
      }
    }
  }

  public static void removeDuplicates(ArrayList<Integer> a)
  {
    int i = 0;
    int j = 1;
    int k = 2;
    while(j != a.size())
    {
      if(k == a.size())
      {
        break;
      }
      if(a.get(i) == a.get(j))
      {
        if(a.get(j) == a.get(k))
        {
          a.remove(k);
          a.remove(j);
        }
        else
        {
          a.remove(j);
        }
      }
      i++;
      j++;
      k++;
    }
  }

  public static void swapPairs(ArrayList<String> a)
  {
    int i = 0;
    int j = 1;
    while(j < a.size())
    {
       String str = a.get(i);
       a.set(i, a.get(j));
       a.set(j, str);
       i = i + 2;
       j = j + 2;
    }
  }

  public static void doubleList(ArrayList<String> a)
  {
    int index = 0;
    ArrayList<String> temp = new ArrayList(a.size());
    for(String str: a)
    {
      temp.add(str);
    }
    for(String str: temp)
    {
      a.add(index, str);
      index = index + 2;
    }
  }

  public static void removeShorterStrings(ArrayList<String> a)
  {
    int i = 0;
    int j = 1;
    System.out.println("original: " + a.toString());
    while(true)
    {
      if((a.size()%2 != 0) && (j > a.size()))
      {
        break;
      }
      if(a.get(i).length() > a.get(j).length())
      {
        a.remove(j);
      }
      else if(a.get(i).length() == a.get(j).length())
      {
        a.remove(i);
      }
      else
      {
        a.remove(i);
      }
      i++;
      j++;
    }
  }
  public static String censor(String s, char c)
  {
    //return s.replace(c,'*');
    String str = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
        str = str + "*";
      }
      else
      {
        str = str + s.charAt(i);
      }
    }
    return str;
  }
}
