package org.launchcode.studio7;

public class CD extends BaseDisc implements DiskDataStorage {

    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The CD '" + this.name + "' spins at a rate of 200-500 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("A copy of the " + this.discType + " named '" + this.name + "' has been burned to the CD.");
    }

    @Override
    public void readData() {
        System.out.println("The CD is now playing the " + this.discType + " named '" + this.name + "'.");
    }


}
