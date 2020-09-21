object leetcode1 {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
      var ans: Array[Boolean] = new Array[Boolean](candies.size);
      var mx = candies(0);
      for (i <- candies) {
        mx = i.max(mx);
      }
      for (i <- 0 until ans.size) {
        if (extraCandies + candies(i) >= mx) {
          ans(i) = true;
        } else {
          ans(i) = false;
        }
      }
      return ans;
    }
}
