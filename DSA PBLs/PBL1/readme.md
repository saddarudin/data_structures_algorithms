# Pakistani University Ranking and Analysis System

This project, developed as part of my Data Structures and Algorithms (DSA) coursework, is a comprehensive analysis system for Pakistani universities. The solution is built using Java and structures university data based on rankings, publication counts, and geographical performance.

## Project Breakdown

The system is implemented in four main steps:

### Step 1: University Objects

A Java class representing Pakistani universities is created to store essential information:
- **Name**
- **World Ranking**
- **Asia Ranking**
- **Pakistan Ranking**
- **Location**
- **Number of Publications**

### Step 2: Hash Table Implementation

A hash table is constructed to store each university object using a unique 4-word key (derived from the university name). This ensures efficient data retrieval by key.

### Step 3: Publication-Based Stack

A stack of universities is created based on the number of publications, with the university having the highest publications positioned at the top. This forms a unique ranking based on publication output.

### Step 4: Ranking-Based Stack

A second stack is organized based on university rankings. Universities with the highest rankings are placed at the top, establishing a custom ranking order based on the dataset’s provided ranking data.

## Problems Addressed

The system addresses the following specific problems:

### Problem 1: Efficient Data Search Using 4-Word Key

The hash table allows quick searching of university data by 4-word key, minimizing collision and optimizing lookup efficiency.

### Problem 2: Top, Bottom, and Percentile-Based Retrieval

To provide meaningful insights, methods have been implemented to retrieve:
- Top 5, Top 25, and Bottom 5 universities
- 50th percentile universities (median) based on both the publication count and dataset rankings

These methods output university information in a tabular format, either in the command line or GUI, making data easy to interpret.

### Problem 3: Provincial Performance Comparison

To assess performance at a provincial level, the system compares universities based on location, identifying the best- and worst-performing provinces by ranking and publication output.

## Usage

1. Clone the repository and compile the Java code.
2. Add data of Pakistani universities to initialize the objects and hash table.
3. Run the methods to display or search data as required.

## Future Enhancements

Potential enhancements include:
- Adding a GUI for a more interactive experience
- Expanding the dataset to include more universities
- Integrating data visualization for publication and ranking trends
