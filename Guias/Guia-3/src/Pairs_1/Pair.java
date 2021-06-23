package Pairs_1;

public class Pair<A, B>{
    private A first;
    private B second;
  
    public Pair(A first, B second){
      this.first = first;
      this.second = second;
    }
    @Override
    public String toString() {
        return "["+first+", "+second+"]";
    }

  } 