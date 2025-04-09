import java.util.*;
class TNode{
    int data;
    TNode left;
    TNode right;
    TNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    class BinaryTree{
        TNode root;
        BinaryTree(int data){
        root = new TNode(data);
    }
    public  void insertLeft(TNode root  ,int data){
        root.left=new TNode(data);
    }
    public  void insertRight(TNode root,int data){
        root.right=new TNode(data);
    }
    public  void PreOrder(TNode root){
        if(root==null)
        return;
        System.out.println(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void PostOrder(TNode root){
         if(root==null)
        return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data + " ");
    }
    public  void InOrder(TNode root){
         if(root==null)
        return;
        InOrder(root.left);
        System.out.println(root.data +" ");
        InOrder(root.right);
    }
    }
    public class Main{
        public static void main(String [] args){
           
            BinaryTree bt=new BinaryTree(1);
            bt.insertLeft(bt.root,2);
            bt.insertRight(bt.root,4);
            bt.insertLeft(bt.root.left,3);
            bt.insertLeft(bt.root.right,5);
            System.out.println("InOrder");
            bt.InOrder(bt.root);
            System.out.println("PreOrder");
            bt.PreOrder(bt.root);
            System.out.println("PostOrder");
            bt.PostOrder(bt.root);
            System.out.println("\nNumber of Leaf: " +countLeaf(bt.root));
             System.out.println("Size of Tree: " + size(bt.root));
             System.out.println("Height of Tree: " + height(bt.root));
             System.out.println("Sum of all Nodes: " + sumOfNodes(bt.root));
              System.out.println("Depth of Tree: " + Depth(bt.root));
              System.out.println("Level Order Traversal:" + LevelOfOrder(bt.root));
        }
        public static  int countLeaf(TNode root) {
        if (root == null)
        {
        return 0;
        }
        if (root.left == null && root.right == null) 
        {
        return 1;
        }
        return countLeaf(root.left) + countLeaf(root.right);
        }
    
        public static int size(TNode root) {  
        if(root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
        } public static int height(TNode root) {
        if (root == null)
        return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
public static int sumOfNodes(TNode root) {
        if (root == null) return 0;     
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
     public static int Depth(TNode root) {
        if (root == null)
        return 0;
        int leftDepth = height(root.left);
        int rightDepth = height(root.right);
        
        return 1 + Math.max(leftDepth, rightDepth);
}
        public  static int LevelOfOrder(TNode root) {
        if (root == null)
            return 0;
        
        Queue<TNode> queue = new LinkedList<>();
        queue.offer(root);
        int level =0;
        
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            level++;
        
        for(int i=0;i  < levelSize;i++)
{
    
     
        
            TNode current = queue.poll();
           

            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
                
        }
}

return level;
}
}