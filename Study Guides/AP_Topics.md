# AP Topics

## 2D Arrays

### Unit Objectives
- Represent collections of related primitive or object reference data using two-dimensional (2D) 
- For 2D array objects: 
  - Traverse using nested for loops. 
  - Traverse using nested enhanced for loops. 
  
### Quick Review
- 2D arrays are stored as arrays of arrays. Therefore, the way 2D arrays are created and indexed is similar to 1D array objects. 
  - 2D array objects that are not rectangular are outside the scope of the course and AP Exam. 
- For the purposes of the exam, when accessing the element at arr[first][second], the first index is used for rows, the second index is used for columns. 
- The initializer list used to create and initialize a 2D array consists of initializer lists that represent 1D arrays. 
- The square brackets [row][col] are used to access and modify an element in a 2D array. 
- “Row-major order” refers to an ordering of 2D array elements where traversal occurs across each row, while “column-major order” traversal occurs down each column. 
- Nested iteration statements are used to traverse and access all elements in a 2D array. Since 2D arrays are stored as arrays of arrays, the way 2D arrays are traversed using for loops and enhanced for loops is similar to 1D array objects. 
- Nested iteration statements can be written to traverse the 2D array in “row-major order” or “column-major order.” 
- The outer loop of a nested enhanced for loop used to traverse a 2D array traverses the rows. Therefore, the enhanced for loop variable must be the type of each row, which is a 1D array. The inner loop traverses a single row. Therefore, the inner enhanced for loop variable must be the same type as the elements stored in the 1D array. 
- When applying sequential/linear search algorithms to 2D arrays, each row must be accessed then sequential/linear search applied to each row of a 2D array. 
- All standard 1D array algorithms can be applied to 2D array objects. 

