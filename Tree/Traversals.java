import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data= data;
        this.left = this.right= null;
    }
}
class Main{
    public static Node BST(Node root,int val){
        if(root == null){
            Node newnode = new Node(val);
            //root = newnode;
            return newnode;
        }
        if(val> root.data ){
            root.right = BST(root.right,val);
        }
        else if(val< root.data){
            root.left = BST(root.left,val);
        }
        return root;
    }
    public static void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }
    public static void Preorder(Node node){
        //root left right
        if(node==null){
            return;
        }
        System.out.println(node.data);
        Preorder(node.left);
        Preorder(node.right);
    }
    public static void Postorder(Node node){
        //left right root
        if(node==null){
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.println(node.data);
    }
    public static void Levelorder(Node node){
        //left right root
        if(node==null){
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        //initia
        Node root=null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val;
        //int arr = new int[n];
        for(int i=0;i<n;i++){
            val= sc.nextInt();
        
        if(i==0){
            //first element is the root of the bst tree
            root = BST(root,val); //BST(null,val)
        }
        else{
            BST(root,val);
        }
        }
        Inorder(root);
    }
}
