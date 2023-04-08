package easy;
/*Given an array arr of size N, write a program that returns 1 if array represents
Inorder traversal of a BST, else returns 0.*/
public class InorderTraversalandBST {
    static int isRepresentingBST(int arr[], int N)
    {
        for(int i=1;i<N;i++){
            if(arr[i-1]>=arr[i])
                return 0;
        }
        return 1;
    }
}
