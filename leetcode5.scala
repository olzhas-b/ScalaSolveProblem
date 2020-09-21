object leetcode5 {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    var sz = 0;
    for(i <- 0 until nums.size) {
      if(i % 2 == 0) sz += nums(i)
    }
    var ans : Array[Int] = new Array[Int](sz);
    var loc = 0;
    for(i <- 0 until nums.size) {
      if(i % 2 == 0) {
        var k = nums(i);
        var value = nums(i + 1);
        while(k != 0) {
          ans(loc) = value;
          loc += 1;
          k -= 1;
        }
      }
    }
    return ans;
  }
}
