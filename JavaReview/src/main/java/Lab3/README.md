<h1>Lab3</h1>
Interfaces, Collections, Generics
A tourist is about to visit a city, in a period of time. In this city, there are various attractions: tourist sites, concerts, (football) games, etc. Each attraction has a name (title) and may have other common properties (such as a description, image, etc). Depending on its type, each location has various specific properties. If the location is a visitable, it must specify on what days of the week and at what hours is it open (can be visited, takes place, etc).
If the location is payable, it must have the entry fee (the price of the ticket).

The main specifications of the application are:

1.Create an object-oriented model of the problem. You should have at least the following classes Trip, Statue, Church, Concert. The natural ordering of their objects is given by their names.
Create the interfaces Visitable and Payable. The classes above must implement these interfaces accordingly.
The Trip class will contain the name of the city, the period of time and the List of attractions.
Create at least one object of each class.

2.Implement the visiting timetable of the attractions using a Map in which the keys are dates and the values are time intervals.
Implement the time interval as a pair of LocalTime objects, using generics.
In the Trip class, create a method to display the locations that are visitable and are not payable, sorted by their opening hour.
Create default methods in the interface Visitable, that teturns the opening hour for a given date.
Create the class TravelPlan. An instance of this class will specify in which day the tourist will visit each attraction.
Create a travel plan and print it on the screen.