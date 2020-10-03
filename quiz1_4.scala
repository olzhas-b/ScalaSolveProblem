object quiz1_4 extends App {
   class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
       var value: Int = _value
       var left: TreeNode = _left
       var right: TreeNode = _right
   }
    var mx = 0;
    def dfs(root: TreeNode, previous: Int): Int = {
      if(root == null) return 0;
      var sum1 = dfs(root.left, root.value);
      var sum2 = dfs(root.right, root.value);
      mx = math.max(mx, sum1 + sum2);
      if(root.value == previous) return math.max(sum1, sum2) + 1;
      else return 0;
    }
    def longestUnivaluePath(root: TreeNode): Int = {
      mx = 0;
      dfs(root, 0);
      return mx;
    }

}
