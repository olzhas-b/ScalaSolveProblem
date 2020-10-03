object quiz1_2 extends App {
  def tribonacci(n: Int): Int = {
    var dp : Array[Int] = new Array[Int](38);
    dp(0) = 0;
    dp(1) = 1;
    dp(2) = 1;
    for(i <- 3 to n) {
      dp(i) = dp(i - 3) + dp(i - 2) + dp(i -  1);
    }
    return dp(n);
  }
}
