#include<stdio.h>
int main(){
    int a;
    long b;
    long long c;
    double d;
    long double e;

    printf("Size  of int : %zu bytes\n",sizeof(a));
    printf("Size of long long : %zu byte\n",sizeof(b));
    printf("Size of double : %zu byte\n",sizeof(d));
    printf("Size of long double : %zu byte\n",sizeof(e));

    return 0;
}
