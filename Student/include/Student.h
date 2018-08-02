#ifndef STUDENT_H
#define STUDENT_H
#include<string>
#include<iostream>

using namespace std;

class Student
{


    protected:
        string Department;
        string Rollno;

    public:
        Student();
        ~Student();
        Student(string Department,string Rollno);
         string getDepartment(){return this->Department;}
        string getRollno(){return this->Rollno;}


};

#endif // STUDENT_H
