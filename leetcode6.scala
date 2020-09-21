object leetcode6 {
  def sumZero(n: Int): Array[Int] = {
    var i = 0;
    var ans : Array[Int] = new Array[Int](n);
    if(n % 2 == 1) {
      ans(i) = 0;
      i+=1
    }
    var k = 1;
    while(i < n) {
      ans(i) = k;
      if(k < 0) {
        k-=1;
      }
      k *= -1;
      i+=1;
    }
    return ans;
  }
}
