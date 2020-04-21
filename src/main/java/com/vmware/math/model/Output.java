package com.vmware.math.model;

public class Output {
    private String result;

    public Output() {
    }

    public Output(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Output{" +
                "result=" + result +
                '}';
    }
}
