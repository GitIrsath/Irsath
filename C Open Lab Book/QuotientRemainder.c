#include<stdio.h>
int main(){
    int dividend,divisor,quotient,remainder;
    printf("Enter Dividend : ");
    scanf("%d",&dividend);

    printf("Enter Divisor : ");
    scanf("%d", &divisor);

    quotient=dividend/divisor;
    remainder=dividend%divisor;

    printf("Quotient = %d",quotient);
    printf("Remainder = %d",remainder);
    return 0;
}
