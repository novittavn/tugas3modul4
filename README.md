# Student Grade Management System

This is a simple Student Grade Management System project built with Java. The system allows you to manage student data by adding students with their names and grades, calculating the average grade, and categorizing the overall grade. Each student has two attributes: name and grade.

## Features
- Add a new student with name and grade.
- Calculate the average grade of all students.
- Categorize the average grade as "Sangat Baik," "Baik," "Cukup," "Kurang," or "Sangat Kurang" based on the score.
- Display the current list of students with their names and grades.

## Project Structure

The project consists of two main classes:
- Siswa: Represents an individual student.
- PengelolaNilai: Manages student data, including adding students, calculating the average grade, and categorizing the grade.

## Getting Started

### Prerequisites

To run this project, you will need:
- Java Development Kit (JDK) installed on your machine.
- A code editor or IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/).

### How to Run

1. Clone or download this repository to your local machine:
   ```bash
   git clone https://github.com/novittavn/tugas3mod4.git

2. Open the project in your preferred IDE and run the main program.

3. The program will prompt you to:

- Enter the number of students.
- Enter the name and grade for each student.
- Display the list of students.
- Calculate and display the average grade.
- Display the grade category based on the average score.

### Sample Output

- Masukkan jumlah siswa: 2
- Masukkan nama siswa ke-1: Andi
- Masukkan nilai siswa ke-1: 85
- Masukkan nama siswa ke-2: Budi
- Masukkan nilai siswa ke-2: 90

Daftar Siswa:
- Nama: Andi, Nilai: 85.00
- Nama: Budi, Nilai: 90.00

Rata-rata nilai siswa: 87.50 Kategori nilai: Baik

### How to Modify the Code

- Adding a New Student: You can add more students by calling the tambahSiswa method:

  pengelola.tambahSiswa("Citra", 78);
  
- Customizing Grade Categories: You can modify the grade thresholds within the tentukanKategoriNilai method.

### Contributing

Feel free to contribute by creating issues or submitting pull requests. Ensure you follow proper coding conventions.

### License

This project is open-source and available under the MIT License.

### Author

Created by [Novita Dian (Nobie)].




