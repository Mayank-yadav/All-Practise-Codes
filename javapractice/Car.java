package org.polymorphism;

public abstract class Car{
int noOfWheels=30;
abstract void ignition();
void changeGear(){
	System.out.println("Absract ChangeGear called");
}

}