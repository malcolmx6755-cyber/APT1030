#include <stdio.h>


int main(){
    char name[50];
    int units;

    printf("Enter your name:");
    scanf("%49s", name);

    printf("Enter number of registered units:");
    scanf("%d", &units);

    char* status;
    if(units > 7){
        status = "Overload - Approval Required";
    }
    else{
        status = "Registration Accepted";
    }
    printf("NAME: %s\n",name);
    printf("UNITS: %d\n", units);
    printf("STATUS: %s\n", status);
    

    return 0;

}