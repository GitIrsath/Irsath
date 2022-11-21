#include<stdio.h>
int main(){
    int a=5,b=10,temp;
    printf("Before Swapping ");
    printf("a=%d,b=%d\n",a,b);

    temp=a;
    a=b;
    b=temp;

    printf("After Swapping ");
    printf("a=%d,b=%d",a,b);
}
