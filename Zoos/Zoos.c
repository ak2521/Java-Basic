#include <stdio.h>

int main(){
	char str[19];
	scanf("%s",str); 
	int count=0,count1=0;
	int i;
	for(i=0;i<strlen(str);i++)
	{
	if(str[i]=='z')
	{
		count++;
	}
	if(str[i]=='o')
	{
		count1++;
	}
	}
	//printf("%d %d %d",count,count1,s);
	if(count1%2==0)
	{

	}
	else
	{
		count1=count1+1;
	}
	if(count==count1/2)
	{
		printf("Yes\n");
	}

	if(count!=count1/2)
	{
		printf("No");
	}
	return 0;
}

