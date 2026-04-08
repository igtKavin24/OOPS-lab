import java.util.*;
public class Students_marks{
public static void main(String[] args) {
int maths, phy, che, eng, compsc;
double finalscore;
boolean result=true;
Scanner marks = new Scanner(System.in);
do
{
System.out.println("Enter Marks for Maths:");
maths=marks.nextInt();
System.out.println("Enter Marks for Phy: ");
phy=marks.nextInt();
System.out.println("Enter Marks for Che: ");
che=marks.nextInt();
System.out.println("Enter Marks for Eng: ");
eng=marks.nextInt();
System.out.println("Enter Marks for CompSc: ");
compsc=marks.nextInt();
finalscore=(maths+eng+phy+che+compsc)/5;
if (finalscore >90)
System.out.println("Excellent");
else if (finalscore>80)
System.out.println("V.Good");
else if (finalscore>60)
System.out.println("Good");
else if (finalscore >40)
System.out.println("Average");
else
System.out.println("Poor");
System.out.println("Any more students?");
result = marks.nextBoolean();
}
while(result);
} 		
}


