   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       if (root == null) { return 0; }
       else { return Math.max(height(root.right), height(root.left)) + 1; }
    }

