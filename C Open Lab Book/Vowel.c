#include<stdio.h>
int main(){
    char c;
    char lowercase_vowel,uppercase_vowel;
    printf("Enter a Alphabet : ");
    scanf("%c",&c);

    lowercase_vowel=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    uppercase_vowel=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    if(lowercase_vowel||uppercase_vowel){
        printf("%c is a Vowel",c);
    }
    else if(!isalpha(c)){
        printf("ERROR! , Enter Alphabet");
    }
    else {
        printf("%c is a Consonant",c);
    }
  }

