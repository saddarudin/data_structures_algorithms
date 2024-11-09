# Earthquake Analysis System

This project is a Java-based system for analyzing global earthquake data from 1965 to 2016. Using data structures like queues, stacks, and linked lists, the system organizes earthquake information by location, magnitude, and time. The system leverages reverse geocoding to identify the city and country of each earthquake based on geographic coordinates.

## Project Breakdown

The earthquake analysis is implemented in the following steps:

### Step 1: Reverse Geocoding and Yearly Collection

Using the [reverse geocoding library for Java](https://www.daniel-braun.com/technik/reverse-geocoding-library-for-java/), each earthquake's city and country are determined based on latitude and longitude coordinates. Each year from 1965 to 2016 has its own collection, storing:
- **City**
- **Country**
- **Magnitude**

This results in 52 collections, each representing a year's earthquakes.

### Step 2: Queue of Yearly Maximum Earthquakes

A queue is created to store the highest-magnitude earthquake for each year from 1965 to 2016. Each entry includes:
- **Magnitude**
- **Country**

The queue contains 52 entries, with each entry representing the largest quake of the respective year.

### Step 3: Country-Based Earthquake Stacks

A stack is created for each country to store its earthquakes, organized in the order of occurrence, with the most recent event on top. This structure allows easy access to recent earthquakes by country.

### Step 4: Linked List of Most Recent Earthquakes by Country

Using the stacks from Step 3, a linked list is created that stores only the most recent earthquake for each country. Each node contains:
- **Magnitude**
- **Country**

This linked list provides efficient access to recent earthquake data for every country represented in the data.

## Problems Addressed

### Problem 1: Average Annual Earthquake Count and Most Vulnerable Country

The system calculates the average number of earthquakes per year for each country and identifies the country most vulnerable to earthquakes (the one with the highest earthquake count).

### Problem 2: Largest Earthquakes (2005 - 2015)

Using the queue from Step 2, the system finds the largest earthquakes that occurred between 2005 and 2015, along with their respective countries.

### Problem 3: Recent Earthquakes by Country

From each country's stack, the system retrieves the 5 most recent earthquakes, providing an up-to-date view of seismic activity for each location.

### Problem 4: Most Recent Earthquakes Over Magnitude 6

Using the linked list created in Step 4, the system identifies the most recent earthquakes with a magnitude above 6.

## Usage

1. Clone the repository and compile the Java code.
2. Add earthquake data, including coordinates and magnitudes.
3. Run methods to:
   - Retrieve average yearly earthquake counts by country
   - Find the most vulnerable country
   - Identify the largest earthquakes from 2005 to 2015
   - Access the 5 most recent earthquakes by country
   - Locate recent earthquakes over magnitude 6

## Future Enhancements

Possible future improvements include:
- Adding a GUI to visualize earthquake data on a map
- Providing filtering options based on location and magnitude
- Integrating a real-time data API for up-to-date earthquake information
