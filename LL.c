#include <stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
void printList(struct Node *ptr)
{
    while(ptr!=NULL)
    {
        
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
    printf("\n");
}
struct Node *insertAtIndex(struct Node *head,int data,int index)
{
    struct Node *ptr=(struct Node*)malloc(sizeof(struct Node));
    struct Node *p=head;
    int i=0;
    while(i!=index-1)
    {
        p=p->next;
        i++;
    }
    ptr->data=data;
    ptr->next=p->next;
    p->next=ptr;
    return head;
}

struct Node *deleteAtIndex(struct Node *head,int index)
{
    struct Node *p=head;
    struct Node *q=head->next;
    for(int i=0;i<index-1;i++)
    {
        p=p->next;
        q=q->next;
    }
    p->next=q->next;
    free(q);
    return head;
}

struct Node * insertAtEnd(struct Node *head, int data){
    struct Node * ptr = (struct Node *) malloc(sizeof(struct Node));
    ptr->data = data;
    struct Node * p = head;
 
    while(p->next!=NULL){
        p = p->next;
    }
    p->next = ptr;
    ptr->next = NULL;
    return head;
}

struct Node * insertAtFirst(struct Node *head, int data){
    struct Node * ptr = (struct Node *) malloc(sizeof(struct Node));
    ptr->data = data;
    ptr->next = head;
    return ptr; 
}

struct Node *deleteAtFirst(struct Node *head){
    head=head->next;
    return head;
}

struct Node *deleteAtLast(struct Node *head){
    struct Node * p =head;
    struct Node *q=head->next;
    while(q->next!=NULL)
    {
        p=q;
        q=q->next;
    }
    p->next=NULL;
}




    
int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    head=(struct Node *)malloc(sizeof(struct Node));
    second=(struct Node *)malloc(sizeof(struct Node));
    third=(struct Node *)malloc(sizeof(struct Node));
    head->data=10;
    head->next=second;
    second->data=20;
    second->next=third;
    third->data=30;
    third->next=NULL;
    printList(head);
    insertAtIndex(head,40,1);
    printList(head);
    deleteAtLast(head);
    head=insertAtFirst(head,4);
    printList(head);

    return 0;
}