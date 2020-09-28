object leetcode14 extends App {
  def findPairs(nums: Array[Int], k: Int): Int = {
    if(k < 0) return 0;
    var ans = Set[(Int, Int)]();
    var nums_set = Set[Int]();
    for(i <- nums) {
      if(nums_set.contains(i + k)) {
        var mn = math.min(i + k, i);
        var mx = math.max(i + k, i);
        ans += ( (mn, mx) );
      }
      if(nums_set.contains(i - k)) {
        var mn = math.min(i - k, i);
        var mx = math.max(i - k, i);
        ans += ( (mn, mx) );
      }
      nums_set += i;
    }
    return ans.size
  }
}
