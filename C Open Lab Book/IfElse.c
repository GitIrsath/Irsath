#include<stdio.h>
int main(){
    int number;
    printf("Enter an Integer : ");
    scanf("%d",&number);

    if(number<0){
        printf("You have Entered : %d\n",number);
    }
    else{
        printf("If Else is Easy");
    }
    return 0;
}
