#include<stdio.h>
int main(){
    double first,second,temp;
    printf("Enter the first value : ");
    scanf("%lf",&first);
    printf("Enter the second value : ");
    scanf("%lf",&second);

    temp=first;
    first=second;
    second=temp;

    printf("\nAfter swapping,first number=%2lf\n",first);
    printf("After Swapping,second number=%2lf",second);

    return 0;
}
