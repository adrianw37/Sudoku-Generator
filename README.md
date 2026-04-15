# Sudoku-Generator

Student Name: Adrian Wu

Project Description:
This project is a Java program that generates a solved 9×9 Sudoku board. It first creates a base board using a mathematical pattern and then randomizes it by swapping rows and columns within specific groups. The final board is printed a formatted layout that looks like a traditional Sudoku grid.

How to Run:
- Open Java sandbox on code HS
- Paste the source code and click run
  
Summary: 
Using the formula (i * 3 + i / 3 + j) % 9 + 1, the program generates a valid base sudoku that is then referenced and modified to become more random. The program randomizes the board by swapping the rows within its box (box 0: rows 0-2, box 1: rows 3-5, box 3: rows 6-8). Swapping the columns would follow the same logic where it swaps with another column in the same box. These modifications ensure that the result won't go against any of the sudoku rules and create a different board each time.

Files:
- SudokuGenerator.java
- README.md
- Adrian Wu - Project_ Sudoku Puzzle Generator [50 points].docx
