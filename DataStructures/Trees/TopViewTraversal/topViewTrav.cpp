/*
struct node
{
    int data;
    node* left;
    node* right;
};

*/

void top_left(node * root) {
    if (root->left != NULL) {
        top_left(root->left);
    }
    
    cout << root->data << " ";  
}


void top_right(node * root) {
    cout << root->data << " "; 
    
    if (root->right != NULL) {
        top_right(root->right);
    }
}

void top_view(node * root)
{
    if (root->left != NULL) {
        top_left(root->left);
    }
    
    cout << root->data << " ";
    
    if (root->right != NULL) {
        top_right(root->right);
    }
 
}

