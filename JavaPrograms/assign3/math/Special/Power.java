package math.Special;

public class Power{
  public int power(int a, int b){
    int i=1;
    int j=1;
    for(i=1; i<=b; i++){
      j = j*a;
    }
    return j;
  }
}
