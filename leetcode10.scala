object leetcode10 {
  def buildArray(target: Array[Int], n: Int): List[String] = {
    var ans : List[String] = List[String]();
    var k = 1;
    for(i <- target) {
      for(j <- k until i) {
        ans :+= "Push";
        ans :+= "Pop";
      }
      k = i + 1;
      ans :+= "Push";
    }
    return ans;
  }
}
