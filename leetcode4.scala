object leetcode4 {
  def repeatedNTimes(A: Array[Int]): Int = {
    var s = Set[Int]();
    for(i <- A) {
      if(s.contains(i)) return i;
      s += i;
    }
    return 0;
  }
}
