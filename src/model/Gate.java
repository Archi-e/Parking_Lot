package model;

import model.enums.GateStatus;
import model.enums.GateType;

public class Gate extends BaseModel{
    private int gateNumber;
    private GateStatus gateStatus;
    private GateType gateType;
    private Operator operator;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "gateNumber=" + gateNumber +
                ", gateStatus=" + gateStatus +
                ", gateType=" + gateType +
                ", operator=" + operator +
                '}';
    }
}
