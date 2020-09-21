object leetcode9 extends App {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    var s1 =  Set[Int]();
    var s2 =  Set[Int]();
    for(i <- nums1) {
      s1 += i;
    }
    for(i <- nums2) {
      s2 += i;
    }
    return s1.intersect(s2).toArray;
  }
}
