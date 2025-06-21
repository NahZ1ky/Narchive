#include <string.h>

/*
 * PURPOSE: The last race of F1 2024 season will intense,
 *          McLaren and Ferrari is fighting for the Constructor Championship.
 *          Ferrari is 8 points down compare to McLaren, but there are, of course, 
 *          still chance of winning for Ferrari.
 *          This program is going to test out all the possible standings four drivers might be in
 *          and print out all the results.
 */

/* All the dataStruct needed */
struct Driver {
  char name[4];
  int standing;
  int points;
};

struct Team  {
  struct Driver driver1;
  struct Driver driver2;

  char name[8];
  int points;
};

struct Possibility {
  struct Team team1;
  struct Team team2;
  
  int team1Standing;
  int team2Standing;
};



/* All the functions needed */
// Initialize all functions
struct Driver makeDriver(char name[3], int standing);
struct Team newTeam(struct Driver driver1, struct Driver driver2, char name[7]);
struct Possibility newPossibility(struct Team team1, struct Team team2);
void teamStandingCalculator(struct Possibility possibility);
void convertStandingToPoints(struct Driver driver);

// new Driver constructor
struct Driver newDriver(char name[3], int standing) {
  struct Driver newDriver;
  strcpy(newDriver.name, name);
  newDriver.standing = standing;

  return newDriver;
}

// Driver assigner & accesser
  // setters
void setDriverStanding(struct Driver driver, int standing) { driver.standing = standing; }
void setDriverPoints(struct Driver driver, int points) { driver.points = points; }
void setDriverName(struct Driver driver, char name[3]) { strcpy(driver.name, name); }
  // getters
int getDriverStanding(struct Driver driver) { return driver.standing; }
int getDriverPoints(struct Driver driver) { return driver.points; }
const char *  getDriverName(struct Driver driver) { return driver.name; } // interesting

// new Team constructor
struct Team makeTeam(struct Driver driver1, struct Driver driver2, char name[7]) {
  struct Team tempTeam;
  strcpy(tempTeam.name, name);
  tempTeam.driver1 = driver1;
  tempTeam.driver2 = driver2;
  tempTeam.points = driver1.points + driver2.points;

  return tempTeam;
}

// Team assigner & accesser
  // setters
void setDriver1(struct Team team, struct Driver driver) { team.driver1 = driver; }
void setDriver2(struct Team team, struct Driver driver) { team.driver2 = driver; }
void setTeamName(struct Team team, char* name[7]) { strcpy(team.name, char* name[7]); }

 // getters
struct Driver getDriver1(struct Team team) { return team.driver1; }
struct Driver getDriver2(struct Team team) { return team.driver2; }
char getName(struct Team team) { return team.name[7]; }
int getPoints(struct Team team) { return team.points; }

// new Possibility initialator
struct Possibility newPossibility(struct Team team1, struct Team team2) {
  struct Possibility tempPossibility;
  tempPossibility.team1 = team1;
  tempPossibility.team2 = team2;
  teamStandingCalculator(tempPossibility);
  return tempPossibility;
}

// teamStanding calculator & assignor
void teamStandingCalculator(struct Possibility possibility) {
  if (possibility.team1.points > possibility.team2.points) {
    possibility.team1Standing = 1;
    possibility.team2Standing = 2;
  } else if (possibility.team1.points < possibility.team2.points) {
    possibility.team1Standing = 2;
    possibility.team2Standing = 1;    
  } else {
    possibility.team1Standing = 0;
    possibility.team2Standing = 0;
  } 
}


// convert driver standing to points 
void convertStandingToPoints(struct Driver driver) {
  switch(driver.standing) {
  case 1:
    driver.points = 25;
    break;
  case 2:
    driver.points = 18;
    break;
  case 3:
    driver.points = 15;
    break;
  case 4:
    driver.points = 12;
    break;
  case 5:
    driver.points = 10;
    break;
  case 6:
    driver.points = 8;
    break;
  case 7:
    driver.points = 6;
    break;
  case 8:
    driver.points = 4;
    break;
  case 9:
    driver.points = 2;
    break;
  case 10:
    driver.points = 1;
    break;
  default:
    driver.points = 0;
    break;
  }
}




// to assign standing with driver, write a nested iterator with four layer,
// make sure to write a break condition where the driver's standing overlaps (besides p11)
// p11 covers all the position from p11 to p20, beacause all of those positions gets 0 pts


// rememeber there are the possibilities of getting an extra point by the fastest lap. 






int main() {
  // Initialize initial points difference
  
  

}






void positionAssigner(struct Driver driver1) { // not finished
  
}
