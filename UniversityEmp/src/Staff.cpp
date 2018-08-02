
#include<iostream>
#include<string>
#include "Staff.h"

using namespace std;

Staff::Staff(string firstname, string lastname)
{
    cout<<"output" << endl;
    cout<< "first name: " << firstname << endl;
     cout<< "Last name: " << lastname << endl;
}

Staff::~Staff()
{
    cout<< "staff object destroyed" << endl;
}
