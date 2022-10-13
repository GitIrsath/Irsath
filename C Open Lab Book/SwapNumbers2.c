#include<stdint-gcc.h>
int main(){
    double a,b;
    printf("Enter a : ");
    scanf("%lf",&a);
    printf("Enter b : ");
    scanf("%lf",&b);

    a=a-b;
    b=a+b;
    a=b-a;

    printf("\nAfter Swapping a=%2lf\n",a);
    printf("After Swapping b=%2lf",b);

    return 0;
}
