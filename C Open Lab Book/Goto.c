#include <stdio.h>
int main() {
    int i;
    const int maxInput=100;
    double number,average,sum=0;

    for(i=0;i<=maxInput;++i){
        printf("%d.Enter the number : ",i);
        scanf("%lf",&number);

        if(number<0){
            goto jump;
        }
        sum+=number;

    }

jump:
    average=sum/(i-1);
    printf("Sum = %2f\n",sum);
    printf("Average = %2f",number);

    return 0;
}

