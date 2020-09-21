object leetcode7 {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    var n = mat.size;
    var m = mat(0).size;
    var res = Array.ofDim[Int](n, 2);
    var ans : Array[Int] = new Array[Int](k);
    for(i <- 0 until n) {
      for(j <- 1 until m) {
        mat(i)(j) += mat(i)(j - 1);
      }
      res(i)(0) = mat(i)(m - 1);
      res(i)(1) = i;
    }
    // bubble sort
    for(i <- 0 until n) {
      for(j <- 0 until n - i - 1) {
        if(res(j)(0) > res(j + 1)(0)) {
          //swap
          var t = res(j)(0);
          res(j)(0) = res(j + 1)(0);
          res(j + 1)(0) = t;
          t = res(j)(1);
          res(j)(1) = res(j + 1)(1);
          res(j + 1)(1) = t;
        }
      }
    }
    var i = 0;
    while(i != k) {
      ans(i) = res(i)(1);
      i+= 1;
    }
    return ans;
  }
}
