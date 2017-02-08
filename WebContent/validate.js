function validate()
{
var num=document.getElementById("numID").value;

    if(num%1!=0)
    	{
    	document.getElementById("demo").innerHTML="Please enter only natural number";
    	return false;
    	}
    else
    	{
	if(!isNaN(num))
		{
	   return true;
		}
	else
		{
		document.getElementById("demo").innerHTML="Please enter a number";
		return false;
		}
    	}
}
