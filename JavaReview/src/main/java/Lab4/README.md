<h1>Lab4</h1>
<h2>Collections, Java Stream API</h2>
Consider a scenario where a group of people wants to make an arrangement by sharing vehicles in order to reach a destination (carpooling, car-sharing, ride-sharing).
Instead of everyone going with their own car, participants agree on the following:

* some of them will be drivers and some of them will be passengers;
* each person has a destination (location where he/she wants to go);
* each driver is willing to pick a passenger in his car (only one), if they have a common destination.

Take into consideration the fact that, on the road to its destination, a driver may pass through other destinations.
The problem is to match drivers and passengers, such that the number of matchings is maximum.
The main specifications of the application are:

- Create a Maven project.
- Create an object-oriented model of the problem.
- Create a random group of persons. Use streams in order to filter the drivers and the passengers.
- Put all the drivers in a LinkedList and print them sorted by their age.
- Put all the passengers in a TreeSet and print them sorted by their name.


- Create a class that describes the problem.
- Using Java Stream API to:
 - compute a list of all the destinations that the drivers pass through;
 - compute a map of destinations and people who want to go there.
- Use a third-party library in order to generate random fake names for persons and destinations.
- Create a greedy algorithm in order to solve the problem.