
package Tugas10;

public class PhoneUser(Phone phone) {
   this.phone = phone; 
}

void turnOn(){
phone.powerOn();
}

void turnOff(){
phone.powerOff();
}

void makeFullVolume(){
phone.powervolumeUp();
}

void makeSilentVolume(){
phone.volumeDown();
}