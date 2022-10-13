#include<stdio.h>
int main(){
    char op;
    double first,second;
    printf("Select the Operator : ");
    scanf("%c",&op);

    printf("Enter Two Numbers : ");
    scanf("%lf %lf",&first,&second);

    switch(op){
        case'+':
        printf("%1lf + %1lf is %1lf",first,second,first+second);
        break;
        case '-':
        printf("%.1lf - %.1lf = %.1lf", first, second, first - second);
        break;
        case '*':
        printf("%.1lf * %.1lf = %.1lf", first, second, first * second);
        break;
        case '/':
        printf("%.1lf / %.1lf = %.1lf", first, second, first / second);
        break;

   default:
       printf("Error! operator is not correct");
     }
     return 0;
        }
