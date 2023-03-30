
import java.util.Scanner;
public class BankApplication {
IngoSearch
class BankAccount{
double bal;
double prevTrans;
public static void main(String[:
Scanner sc=new Scanner (Syste
System.out.println("Enter y
String name=sc.nextLine();
String customerId=sc. nextLir
BankAccount obj1=new BankAc(
obj1.menu();
String customerName;
String customerId;
BankAccount (String customerName
this.customerName=customerNa
this.customerId=customer Id;
void deposit ( double amount ) {
if(amount !=0) {
bal+=amount;
prevTrans=amount;
}
withdraw( double amt ) {
