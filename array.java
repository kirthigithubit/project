
public class array {

	public static void main(String[] args) {
        System.out.println("Array concept");	
int[] number=new int[3];
char[] ch=new char[3];
 
byte[] by=new byte[3];
float[] fl=new float[3];
short[] sh=new short[3];
boolean[] bool=new boolean[3];
byte[] by=new byte[3];
float[] fl=new float[3];
short[] sh=new short[3];
boolean[] bool=new boolean[3];

for(int i=0;i<by.length;i++)
	{
	   System.out.println(by[i]);
	}

for(int i=0;i<fl.length;i++)
{
   System.out.println(fl[i]);
}
for(int i=0;i<sh.length;i++)
{
   System.out.println(sh[i]);
}
for(int i=0;i<ch.length;i++)
{
   System.out.println(ch[i]);
}
for(int i=0;i<number.length;i++)
{
   System.out.println(number[i]);
}
System.out.println("***** print 0,2,4,6th index *****");
int[] numbers={55,44,33,22,99,77,88,11};//0,2,4,6th index
for(int j=0;j<numbers.length;j=j+2)
{
	System.out.println(numbers[j]);
}

	}	
}
