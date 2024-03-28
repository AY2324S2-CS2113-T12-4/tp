# Developer Guide

## Acknowledgements

{list here sources of all reused/adapted ideas, code, documentation, and third-party libraries -- include links to the original source as well}

## Design & implementation

{Describe the design and implementation of the product. Use UML diagrams and short code snippets where applicable.}

[Proposed] Update feature

Proposed Implementation

The proposed update feature is mainly carried out by `TravelActivityList`. It stores objects with class `TravelActivity`in an array called `travelActivities`
and each `TravelActivity` class object contains a date and duration. The `TravelAcivityList` also contains the following method:
* `TravelActivityList#updateTravelActivity(travelActivityNumber, date, duration)`-- Updates the date and duration of the specified object of `TravelActivity` class type.

Step 1. When the user launches the app for the first time, there will be no objects of type `TravelActivity` in `travelActivities`.
Thus any attempts to call the command `update INDEX`
will result in an output telling the user that no travel activity can be found.

Step 2. After the user has added new travel activities into the `travelActivityList`, the user can execute
`update 1 /date 2020-12-20 /duration 2hours` command to update the date and duration of the first travel activity
in the travel activity list. The `update` command calls the `Parser#updateCommand(line, list)` which then calls the `TravelActivityList#updateTravelActivity(travelActivityNumber, date, duration)`
. 

Step 3. The method will then find the travel activity with the corresponding travel activity number in the `travelActivities` and then set the new date and duration
of that travel activity.

The sequence diagram below shows how an update operation goes through the parser component:
![img.png](img.png)

[Proposed] Track feature

Proposed Implementation

The proposed track feature is carried out by `ExpenseTracker`. It stores objects with class `Expense` in an array called `expenseList`
and each `Expense` class object contains a description, category, and cost. The `ExpenseTracker` also contains the following method:
* `ExpenseTracker#trackExpense(description, cost, category)`-- Creates an instance of the `Expense` class and stores it in the `expenseList`

Given below is an example usage scenario and how the track expense mechanism behaves at each step

Step 1. The user launches the application for the first time. A new `ExpenseTracker` will be initialized.

Step 2. To track an expense, the user can execute `track lunch /cost 12 /category food` command to track the expense.
The `track` command calls the `Parser#trackCommand(line, list)` which then calls `ExpenseTracker#trackExpense(description, cost, category)`.



## Product scope
### Target user profile

{Describe the target user profile}

### Value proposition

Tourists may have many plans during their holiday. Omnitravel aims to be a one-stop-shop for all travel plans.
Omnitravels stores the user's travel plans and enable them to quickly retrieve their travel plans using the search 
functions.

## User Stories

|Version| As a ... | I want to ... | So that I can ...|
|--------|----------|---------------|------------------|
|v1.0|new user|see usage instructions|refer to them when I forget how to use the application|
|v2.0|user|find a to-do item by name|locate a to-do without having to go through the entire list|

## Non-Functional Requirements

{Give non-functional requirements}

## Glossary

* *glossary item* - Definition

## Instructions for manual testing

- To find all travel plans with the same keyword

Example: find rvrc

Result:
____________________________________________________________
Here are what you are looking for:
1. Accommodation: rvrc :24 Dec 2024 :2 weeks
____________________________________________________________

- To find all travel plans with the same tag

Example: findtag delicacies

Result: 
____________________________________________________________
Here are what you are looking for:
1. Food: Popia :1 Dec 2020 :1hour
2. Food: kfc :12 Dec 2024 :1 hour
____________________________________________________________


{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing}
