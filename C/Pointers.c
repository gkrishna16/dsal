#include <stdio.h>

typedef struct {
    int squareFeet;
    int NumBedrooms;
    int NumBaths;
} House;

typedef struct {
    int bunglowNum;
    int dimension;
    int temperature;
} Bunglow;

int
main(int argc, char *argv[])
{

    //byte *pBkgndColor = (byte *)53281;
    //pBkgndColor = 0;

    //int *num =(int *) 54321;
    //*num = 100;
    //printf("%d\n", &num);

    House somehouse = {960, 2, 1};


    return 0;
}