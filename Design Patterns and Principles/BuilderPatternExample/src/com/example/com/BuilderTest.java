package com.example.com;

public class BuilderTest
{
    public static void main(String[] args)
    {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .setOperatingSystem("Windows 11")
                .build();

        System.out.println("Gaming Computer");
        gamingPC.display();

        System.out.println("Office Computer");
        officePC.display();
    }
}