#include <stdio.h>

int main()
{
    char name[5] = "Gopal";
    int numb[4] = {1,2,3,4};
    for (int i = 0; i < 4;i++){
        printf("%i\n",numb[i]);
        printf("-----");
    }
        printf("%i\n", numb[1]);
    printf("%s\n", name);
    printf("The C file.\n");
}