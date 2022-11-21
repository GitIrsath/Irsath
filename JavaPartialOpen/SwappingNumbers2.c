#include<stdio.h>
int main(){
    int a=5,b=10;
    printf("Before Swapping ");
    printf("a=%d,b=%d\n",a,b);

    a=a+b;
    b=a-b;
    a=a-b;

    printf("After Swapping ");
    printf("a=%d,b=%d",a,b);
}
