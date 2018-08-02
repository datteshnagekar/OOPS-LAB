#include<iostream>
#include<string>
#include "Student.h"
using namespace std;


Student::Student(string Rollno, string Department)
{
     cout<<"output" << endl;
    cout<< "Roll NO: " << Rollno << endl;
     cout<< "Department: " << Department << endl;
}

Student::~Student()
{
    cout<< "student object destroyed" << endl;
}
