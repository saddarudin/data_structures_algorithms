# Car Crash Analysis System

This project is a Data Structures and Algorithms (DSA) implementation designed to analyze car crash data. The system organizes crashes by various criteria including timeline, weather, and crash type. Developed in Java, the project utilizes queues, sub-queues, and binary trees to facilitate efficient data storage and analysis.

## Project Breakdown

The analysis system is implemented through the following steps:

### Step 1: Queue for Car Crashes

A main queue is created to store crash data sequentially from January to December (Day 1 to Day 31). Each entry stores:
- **Day of the Week**
- **Crash Type** (e.g., hit and run, not hit and run)
- **Light Conditions** (e.g., daylight, dark)
- **Weather Conditions** (e.g., clear, snow, rain)
- Additional relevant data (e.g., location, time of crash)

### Step 2: Weather-Based Sub-Queues

Three sub-queues are created from the main queue based on weather conditions:
1. **Clear Weather Crashes**
2. **Snow Weather Crashes**
3. **Rain Weather Crashes**

This categorization allows quick access to crashes under specific weather conditions.

### Step 3: Day-Based Sub-Queues

Seven sub-queues are created, one for each day of the week (Monday to Sunday), to organize crashes by the day they occurred.

### Step 4: Binary Trees for Crash Types

Two binary trees are constructed to store the monthly totals of crashes for:
1. **Hit and Run Crashes** – Crash count per month stored as the tree key.
2. **Not Hit and Run Crashes** – Crash count per month stored as the tree key.

These binary trees allow efficient analysis of crash trends by month for each crash type.

## Problems Addressed

### Problem 1: Identifying Deadliest Days and Fridays

Using the data structure, methods are implemented to determine:
- The deadliest day of the week (Monday to Sunday)
- The deadliest Friday of all months

### Problem 2: Monthly Rainy Day Crash Count

The system can count and display the number of crashes that occurred on rainy days for each month.

### Problem 3: Monthly Analysis of Hit and Run Crashes

Methods identify the month with the highest and lowest counts of:
- **Hit and Run Crashes**
- **Not Hit and Run Crashes**

### Postulate 1: Weekend Crashes in Dark Conditions

The system tests the hypothesis that weekends (Saturdays and Sundays) with dark light conditions result in more crashes than Mondays and Tuesdays.

## Usage

1. Clone the repository and compile the Java code.
2. Populate the queue with crash data for analysis.
3. Use methods to display statistics, such as:
   - Deadliest days and Fridays
   - Monthly rainy day crashes
   - Highest and lowest crash months for each crash type
4. Run the postulate check to compare weekend versus weekday crash rates under dark conditions.

## Future Enhancements

Potential future enhancements include:
- Integrating a GUI for better data visualization and interaction
- Expanding data collection criteria for more granular analysis
- Adding data export options for use in other analysis tools
