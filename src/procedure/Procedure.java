package procedure;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Procedure {
	//=====pola g��wne wykorzystywane w tabeli TableView
	private StringProperty type; 	//typ zabiegu (np toczenie)
	private StringProperty parameters;  //parametry zabiegu
	private StringProperty machine;  //rodzaj obrabiarki
	private DoubleProperty time;		//czas trwania zabiegu
	private DoubleProperty cost;		//koszt wykonania zabiegu
	
	//=====pola pomocnicze konieczne do obliczenia warto�ci p�l g�ownych
	private double preparingTime;		//czas przygotowawczo zako�czeniowy + czas uzupe�niajacy
	private double additionalTime;		//czas pomocniczy (np. dosuni�cie narz�dzia, wymiana narz itp)
	
	public Procedure() {
		this.type = new SimpleStringProperty();
		this.parameters = new SimpleStringProperty();
		this.machine = new SimpleStringProperty();
		this.time = new SimpleDoubleProperty();
		this.cost = new SimpleDoubleProperty();
	}
	
	// getters and setters
    public String getType() {
        return type.get();
    }
 
    public void setType(String type) {
        this.type.setValue(type);
    }
 
    public StringProperty typeProperty() {
        return type;
    }
    //==
    public String getParameters() {
        return parameters.get();
    }
 
    public void setParameters(String parameters) {
        this.parameters.setValue(parameters);
    }
 
    public StringProperty parametersProperty() {
        return parameters;
    }
    //==
    public String getMachine() {
        return machine.get();
    }
 
    public void setMachine(String machine) {
        this.machine.setValue(machine);
    }
 
    public StringProperty machineProperty() {
        return machine;
    }
    //==
    public Double getTime() {
        return time.get();
    }
 
    public void setTime(Double time) {
        this.time.setValue(time);
    }
 
    public DoubleProperty timeProperty() {
        return time;
    }
    //==
    public Double getCost() {
        return cost.get();
    }
 
    public void setCost(Double cost) {
        this.cost.setValue(cost);
    }
 
    public DoubleProperty costProperty() {
        return cost;
    }
    //==
	public double getPreparingTime() {
		return preparingTime;
	}

	public void setPreparingTime(double preparingTime) {
		this.preparingTime = preparingTime;
	}
	//==
	public double getAdditionalTime() {
		return additionalTime;
	}

	public void setAdditionalTime(double additionalTime) {
		this.additionalTime = additionalTime;
	}

	@Override
	public String toString() {
		return "Procedure [type=" + type + ", parameters=" + parameters + ", machine=" + machine + ", time=" + time
				+ ", cost=" + cost + ", preparingTime=" + preparingTime + ", additionalTime=" + additionalTime + "]";
	}
}
