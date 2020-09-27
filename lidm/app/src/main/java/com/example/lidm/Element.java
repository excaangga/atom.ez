package com.example.lidm;

public class Element {

    private String atomicMass;
    private int atomicNumber;
    private String atomicRadius;
    private String boilingPoint;
    private String bondingType;
    private String cpkHexColor;
    private String density;
    private String electronAffinity;
    private String electronegativity;
    private String electronicConfiguration;
    private String groupBlock;
    private String ionRadius;
    private String ionizationEnergy;
    private String meltingPoint;
    private String name;
    private String oxidationStates;
    private String standardState;
    private String symbol;
    private String vanDelWaalsRadius;
    private String yearDiscovered;
    boolean isFlipped;
    boolean added;

    //constructors
    public Element(){ }

    public Element(String atomicMass, int atomicNumber, String atomicRadius, String boilingPoint, String bondingType, String cpkHexColor, String density, String electronAffinity, String electronegativity, String electronicConfiguration, String groupBlock, String ionRadius, String ionizationEnergy, String meltingPoint, String name, String oxidationStates, String standardState, String symbol, String vanDelWaalsRadius, String yearDiscovered, boolean isFlipped, boolean added) {
        this.atomicMass = atomicMass;
        this.atomicNumber = atomicNumber;
        this.atomicRadius = atomicRadius;
        this.boilingPoint = boilingPoint;
        this.bondingType = bondingType;
        this.cpkHexColor = cpkHexColor;
        this.density = density;
        this.electronAffinity = electronAffinity;
        this.electronegativity = electronegativity;
        this.electronicConfiguration = electronicConfiguration;
        this.groupBlock = groupBlock;
        this.ionRadius = ionRadius;
        this.ionizationEnergy = ionizationEnergy;
        this.meltingPoint = meltingPoint;
        this.name = name;
        this.oxidationStates = oxidationStates;
        this.standardState = standardState;
        this.symbol = symbol;
        this.vanDelWaalsRadius = vanDelWaalsRadius;
        this.yearDiscovered = yearDiscovered;
        this.isFlipped = isFlipped;
        this.added = added;
    }

    public Element(int atomicNumber, String symbol, String name){
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
    }

    /*
        *** BEGIN GETTERS AND SETTERS ***
     */

    public String getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(String atomicMass) {
        this.atomicMass = atomicMass;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getAtomicRadius() {
        return atomicRadius;
    }

    public void setAtomicRadius(String atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public String getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(String boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public String getBondingType() {
        return bondingType;
    }

    public void setBondingType(String bondingType) {
        this.bondingType = bondingType;
    }

    public String getCpkHexColor() {
        return cpkHexColor;
    }

    public void setCpkHexColor(String cpkHexColor) {
        this.cpkHexColor = cpkHexColor;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getElectronAffinity() {
        return electronAffinity;
    }

    public void setElectronAffinity(String electronAffinity) {
        this.electronAffinity = electronAffinity;
    }

    public String getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(String electronegativity) {
        this.electronegativity = electronegativity;
    }

    public String getElectronicConfiguration() {
        return electronicConfiguration;
    }

    public boolean getflipped() {
        return isFlipped;
    }
    public void setFlipped(boolean isFlipped) {
        this.isFlipped = isFlipped;
    }

    public boolean getAdded() {
        return added;
    }
    public void setAdded(boolean isAdded) {
        this.added = added;
    }

    public void setElectronicConfiguration(String electronicConfiguration) {
        this.electronicConfiguration = electronicConfiguration;
    }

    public String getGroupBlock() {
        return groupBlock;
    }

    public void setGroupBlock(String groupBlock) {
        this.groupBlock = groupBlock;
    }

    public String getIonRadius() {
        return ionRadius;
    }

    public void setIonRadius(String ionRadius) {
        this.ionRadius = ionRadius;
    }

    public String getIonizationEnergy() {
        return ionizationEnergy;
    }

    public void setIonizationEnergy(String ionizationEnergy) {
        this.ionizationEnergy = ionizationEnergy;
    }

    public String getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(String meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOxidationStates() {
        return oxidationStates;
    }

    public void setOxidationStates(String oxidationStates) {
        this.oxidationStates = oxidationStates;
    }

    public String getStandardState() {
        return standardState;
    }

    public void setStandardState(String standardState) {
        this.standardState = standardState;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getVanDelWaalsRadius() {
        return vanDelWaalsRadius;
    }

    public void setVanDelWaalsRadius(String vanDelWaalsRadius) {
        this.vanDelWaalsRadius = vanDelWaalsRadius;
    }

    public String getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(String yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    /*
     *** END GETTERS AND SETTERS ***
     */
}
