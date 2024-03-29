/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* The Node is defined 
  struct Node
  {
     int data;
     Node *next;
  } */
/*The function below returns an int denoting
the length of the longest palindrome list. */
int countCommon(Node *a, Node *b)
{
    int count = 0;

    for (; a && b; a = a->next, b = b->next)

        if (a->data == b->data)
            ++count;
        else
            break;

    return count;
}

int maxPalindrome(Node *head)
{
    int result = 0;
    Node *prev = NULL, *curr = head;
    while (curr)
    {

        Node *next = curr->next;
        curr->next = prev;

        result = max(result,2*countCommon(prev, next)+1);
        result = max(result,2*countCommon(curr, next));

        prev = curr;
        curr = next;
    }
    return result;
}