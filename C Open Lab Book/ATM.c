#include<stdio.h>
int totaltwothousand=1000;
int totalfivehundred=1000;
int totaltwohundred=1000;

void main(){
    unsigned long withdrawamount;
    unsigned long totalmoney;
    int twothousand=0;
    int fivehundred=0;
    int onehundred=0;

    printf("Enter the amount in Multiples of 100 : ");
    scanf("%lu",&withdrawamount);

    if(withdrawamount%100!=0){
        printf("Invalid Amount");
        return;
    }

    totalmoney=totaltwothousand*10+totalfivehundred*10+totaltwohundred*10;

    if(withdrawamount>totalmoney){
        printf("SORRY,INSUFFICIENT MONEY");
        getch();
        return;
    }
    twothousand=withdrawamount/2000;
    if(twothousand>totaltwothousand)
        twothousand=totaltwothousand;
        withdrawamount=withdrawamount-twothousand*2000;

    if(withdrawamount>0){
        fivehundred=withdrawamount/500;
        if(fivehundred>totalfivehundred)
        fivehundred=totalfivehundred;
        withdrawamount=withdrawamount-fivehundred*500;
    }
    if(withdrawamount>0)
        onehundred=withdrawamount/100;

    printf("Total 2000 note : %d\n",twothousand);
    printf("Total 500 note : %d\n",fivehundred);
    printf("Total 100 note : %d\n",onehundred);

    getch();
}








