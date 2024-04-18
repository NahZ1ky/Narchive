#include <stdio.h>
#include <ctype.h>

int main() {
    char input;
    float temp;
    float convertedTemp;

    char unit = scanf("\nunit: %c", &input);
    char toUnit = scanf("\nto unit: %c", &input);
    scanf("\nand the temperature is: %f", &temp);
    unit = toupper(unit);

    if (unit == '\0' || toUnit == '\0') {
        printf("invalid input, check your input again");
    } else if (unit == toUnit) {
        printf("the temperature is already in %c", toUnit);
    } else if (unit != toUnit) {
        if (unit == 'C' && toUnit == 'F') {
            convertedTemp = temp * 1.8 + 32;
            printf("Temperature %.1f in %c is %.1f in F", temp, unit, convertedTemp);
        } else if (unit == 'C' && toUnit == 'C') {
            convertedTemp = (temp + 32) / 1.8;
            printf("Temperature %.1f in %c is %.1f in F", temp, unit, convertedTemp);
        } else {
            printf("Unit not supported, check again.");
        }
    }
}
