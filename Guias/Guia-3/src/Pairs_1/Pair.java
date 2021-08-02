package Pairs_1;

public class Pair<A, B> {
  private A first;
  private B second;

  public Pair(A first, B second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public String toString() {
    return String.format("[%s, %s]", this.first, this.second);
  }

  public A a() {
    return this.first;
  }

  public B b() {
    return this.second;
  }

  public boolean equals(Pair<A, B> pair) {
    return pair.a().equals(this.first) && pair.b().equals(this.second);
  }
}