#include<stdio.h>
int main(){
    int n,reverse=0,remainder,original;
    printf("Enter an Integer : ");
    scanf("%d",&n);

    while(n!=0){
        remainder=n%10;
        reverse=reverse*10+remainder;
        n/=10;
    }
if(original==reverse)
    printf("%d is a Palindrome",original);
else
    printf("%d is not a Palindrome",original);
}
