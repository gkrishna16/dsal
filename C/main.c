#include <stdio.h>

struct Person {
    char name[64];
    int age;
};

void updateStruct(struct Person * p, int age){
    p->age = age;
}

int main (int argc, char * argv[]){
    struct Person lowlevellearning;
    updateStruct(&lowlevellearning, 100);
    printf("%i\n", lowlevellearning.age);

    int num = 100;
    printf("%i\n", num);

    for (int i = 0; i < 10;i++){
        printf("%i\n", i);
    }

        return 0;
}