#include<stdio.h>
int main(){
    float num1;
    double num2;

    printf("Enter a number : ");
    scanf("%f",&num1);
    printf("Enter another number : ");
    scanf("%1f",num2);

    printf("num1 = %f\n",num1);
    printf("num2 = %1f",num2);

    return 0;
}
