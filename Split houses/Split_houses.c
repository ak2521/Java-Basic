#include<stdio.h>
int main()
{
    int n,flag=0;
    scanf("%d",&n);
    char c[n];
    scanf("%s",c);
    for(int i=0;i<n;i++)
    {
        if(c[i]=='H'&&c[i+1]=='H')
        {
            flag=1;
        }
        else
        {
            if(c[i]=='.')
            c[i]='B';
        }
    }
    if(flag==1)
    {
    printf("NO\n");
    }
    else
{
    printf("YES\n");
    printf("%s",c);
}
return 0;
}
