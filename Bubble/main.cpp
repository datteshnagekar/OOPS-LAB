#include <iostream>

using namespace std;

int main()
{
    cout << "Bubble sort" << endl;
    int temp, data[]={1,5,2,9,23,3,77,45,34,22,23};
    int dataSize = (sizeof(data)/sizeof(*data));
    cout << "OUTPUT !!";

    for(int i=0; i<dataSize; i++)
    {
        cout << "..." << data[i];
        for(int j=0; j<i; j++)
        {
            if(data[i] < data[j])
            {
                temp=data[i];
                data[i]=data[j];
                data[j]=temp;
            }
            }
        }

        cout << "OUTPUT!" << endl;
        for(int i=0;i<dataSize;i++)
        {
         cout << data[i] << " ";
        }
            return 0;
        }






