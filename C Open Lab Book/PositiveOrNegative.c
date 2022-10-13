#include<stdio.h>
int main(){
    double num;
    printf("Enter a number :");
    scanf("%lf",&num);
    if(num<=0){
        if(num==0)
            printf("You Entered 0");
        else
            printf("You Entered a negative number");

    }
        else
            printf("You Entered a Positive number");

        return 0;

}

