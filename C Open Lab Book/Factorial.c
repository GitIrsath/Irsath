#include<stdio.h>
int main(){
    int n,i;
    unsigned long long fact;
    printf("Enter an integer : ");
    scanf("%d",&n);

    if(n<0){
        printf("Error,No Factorial for negative number");
    }
    else{
        for(i=1;i<=n;++i){
            fact*=i;
        }
        printf("Factorial of %d=%llu",n,fact);
    }
    return 0;
}
