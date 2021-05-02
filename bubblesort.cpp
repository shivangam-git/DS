#include<iostream>
using namespace std;
int main(){
int a[20],i,n,loc,item;
int bsort(int a[],int n,int item);
cout<<"enter num of sorted elements";
cin>>n;
for(i=0;i<n;i++)
{
    cout<<"enter element a[ "<<i<<"]----";
    cin>>a[i];
}
int bsort(int a[],int item,int n){
int temp,i,j,k;
for(i=0;i<n-1;i++){
    for(j=0;j<n-1;j++){
        if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
}
cout<<"sorted elements---";s
for(k=0;k<n;k++)
    cout<<a[i]<<endl


}
